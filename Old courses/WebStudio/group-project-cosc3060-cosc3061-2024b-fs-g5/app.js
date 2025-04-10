const express = require('express');
const mongoose = require('mongoose');
const session = require('express-session');
const bcrypt = require('bcryptjs');
const bodyParser = require('body-parser');
const path = require('path');
const cookieParser = require('cookie-parser');
const crypto = require('crypto');
const firebase = require('firebase/app');
require('firebase/auth');
require('dotenv').config();
const { User, Thread, Reply, Guide } = require('./model');
const axios = require('axios');
const sessionConfigs = require('./configs/session');

const app = express();
const db = process.env.DATABASE;
console.log(db);

mongoose.connect(db)
    .then(() => console.log('Connected to MongoDB'))
    .catch(error => console.log(error));

app.set('view engine', 'ejs');
app.set('views', './views');

app.use(express.json());
app.use(express.static('public'));
app.use(bodyParser.urlencoded({ extended: true }));
app.use(cookieParser());

app.use(session(sessionConfigs));

// -------------------------function-----------------------------------------------------------
const formatDate = (date) => {
    const d = new Date(date);
    const day = String(d.getDate()).padStart(2, '0');
    const month = String(d.getMonth() + 1).padStart(2, '0');
    const year = String(d.getFullYear()).slice(-2);
    const hours = String(d.getHours()).padStart(2, '0');
    const minutes = String(d.getMinutes()).padStart(2, '0');
    return `${day}/${month}/${year} at ${hours}:${minutes} `;
};
//---------------------------------------------------------------------------------------------
app.get('/', async (req, res) => {
    try {
        const page = parseInt(req.query.page) || 1;
        const limit = 10; // Number of threads per page


        const threads = await Thread.find({ isArchived: false })
            .populate('createdBy')
            .sort({ date: -1 })
            .skip((page - 1) * limit)
            .limit(limit);

        const totalThreads = await Thread.countDocuments({ isArchived: false });
        const totalPages = Math.ceil(totalThreads / limit);

        console.log(req.session.user);


        res.render('index', {
            threads,
            currentPage: page,
            totalPages,
            userId: req.session.userId,
            user: req.session.user,
            otherUser: req.session.profileView,
            formatDate: formatDate
        });
    } catch (error) {
        res.status(500).send(error);
    }
});

app.get('/terms-of-use', (req, res) => {
    res.render('terms-of-use');
});
app.get('/privacy-policy', (req, res) => {
    res.render('privacy-policy');
});
// -----------------login-------------------------
app.get('/login', (req, res) => {
    res.render('login');
});

app.post('/login', async (req, res) => {
    const { name, password, remember } = req.body;

    try {
        const user = await User.findOne({ name: name });
        if (!user) {
            return res.render('login', { message: 'User not found' });
        }
        const isMatch = await bcrypt.compare(password, user.password);
        if (!isMatch) {
            return res.render('login', { message: 'Invalid password' });
        }
        if (remember) {
            req.session.user = user;
            res.cookie('name', user.name, { maxAge: 30 * 24 * 60 * 60 * 1000, httpOnly: true });
        } else {
            res.cookie('name', user.name, { maxAge: null, httpOnly: true });
        }
        req.session.userId = user._id;
        req.session.user = user;
        res.redirect('/');
    } catch (error) {
        console.error('Error during login:', error);
        res.status(500).send('Internal error');
    }
});

// --------------------------------Register----------------------
app.get('/register', (req, res) => {
    res.render('Register');
});

app.post('/register', async (req, res) => {
    const { name, email, password, confirmPassword, termsCheckbox } = req.body;
    function validatePassword(password) {
        const minLength = 8;
        const hasUppercase = /[A-Z]/.test(password);
        const hasLowercase = /[a-z]/.test(password);
        const hasNumber = /[0-9]/.test(password);
        const hasSpecialChar = /[!@#?$%^&*()_+\-=\[\]{};':"\\|,.\/?]/.test(password);
    
        let criteriaMet = 0;
    
        if (password.length >= minLength) criteriaMet++;
        if (hasUppercase && hasLowercase) criteriaMet++;
        if (hasNumber) criteriaMet++;
        if (hasSpecialChar) criteriaMet++;
    
        return criteriaMet >= 4;
    } 
    const recaptchaToken = req.body['g-recaptcha-response'];
    try {
        const recaptchaResponse = await axios.post('https://www.google.com/recaptcha/api/siteverify', null, {
            params: {
                secret: '6Lfu_0IqAAAAAFEtgvsXMXX4ftjrheprcXFgMPu1',
                response: recaptchaToken
            }
        });

        if (!name) {
            return res.render('register', { message: 'Please enter your name.', 
                                            data: { name, email, password, confirmPassword, termsCheckbox }
            });
        }

        if (!email) {
            return res.render('register', { message: 'Please enter your email.', 
                                            data: { name, email, password, confirmPassword, termsCheckbox }
            });
        }

        const existingUser = await User.findOne({
            $or: [{ name: name }, { email: email }]
        });
        if (existingUser) {
            return res.render('register', { message: 'Username or email already exists.', 
                                            data: { name, email, password, confirmPassword, termsCheckbox }
            });
        }

        if (!validatePassword(password)) {
            return res.render('register', { message: 'Password does not meet the required criteria.',
                                            data: { name, email, password, confirmPassword, termsCheckbox }
                });
        }

        if (password !== confirmPassword) {
            return res.render('register', { message: 'Passwords do not match!',
                                            data: { name, email, password, confirmPassword, termsCheckbox }
                });
        }

        if (!termsCheckbox) {
            return res.render('register', { message: 'You must agree to the terms and conditions to register.', 
                                            data: { name, email, password, confirmPassword, termsCheckbox }
            });
        }

        if (!recaptchaResponse.data.success) {
            return res.render('register', { message: 'Please complete the reCAPTCHA.', 
                                            data: { name, email, password, confirmPassword, termsCheckbox }
            });
        }

        const hashedPassword = await bcrypt.hash(password, 10);
        const photo = '/images/logo.png'
        const user = new User({
            name,
            email,
            password: hashedPassword,
            photo
        });
        await user.save();
        req.session.userId = user._id;
        req.session.user = user;
        res.redirect('/');
    } catch (error) {
        res.status(500).send(error.message);
    }
});

// ------------------------ForgotPassword--------------------------------------
app.get('/forget', (req, res) => {
    res.render('ForgetPassword');
});

app.post('/forget', async (req, res) => {
    const { name, email } = req.body;
    try {
        const user = await User.findOne({ name, email });
        if (!user) 
            return res.render('ForgetPassword', { message: 'User or email not found', });
            // return res.status(400).send('User not found');
        const resetToken = crypto.randomBytes(20).toString('hex');
        const resetExpires = Date.now() + 3600000;
        user.resetPasswordToken = resetToken;
        user.resetPasswordExpires = resetExpires;
        await user.save();
        res.render('ResetPassword', { token: resetToken });
    } catch (error) {
        console.error('Error in password reset request:', error);
        res.status(500).send('Internal error');
    }
});

app.get('/reset-password', (req, res) => {
    res.render('ResetPassword');
});

app.post('/reset-password', async (req, res) => {
    const { token, newPassword } = req.body;
    try {
        const user = await User.findOne({
            resetPasswordToken: token,
            resetPasswordExpires: { $gt: Date.now() }
        });
        if (!user) return res.status(400).send('Invalid or expired token');
        const hashedPassword = await bcrypt.hash(newPassword, 10);
        user.password = hashedPassword;
        user.resetPasswordToken = undefined;
        user.resetPasswordExpires = undefined;
        await user.save();
        res.redirect('/login');
    } catch (error) {
        console.error('Error in password reset:', error);
        res.status(500).send('Internal error');
    }
});

// ---------------------loginByGoogle------------------------------------------

const generateRandomPassword = () => {
    return crypto.randomBytes(8).toString('hex');
};

app.post('/login-with-google', async (req, res) => {
    const { email, displayName } = req.body;
    try {
        let user = await User.findOne({ email });
        if (!user) {
            const tempPassword = generateRandomPassword();
            const hashedPassword = await bcrypt.hash(tempPassword, 10);
            user = new User({
                name: `New${Math.floor(100000 + Math.random() * 900000)}`,
                email,
                displayName,
                password: hashedPassword
            });
            await user.save();
        } else {
            user.displayName = displayName || user.displayName;
            await user.save();
        }
        req.session.userId = user._id;
        req.session.user = user;
        res.json({ success: true });
    } catch (error) {
        console.error('Error during Google login:', error);
        res.status(500).send('Internal Server Error');
    }
});

// ------------------------AboutUs-------------------------------------------

app.get('/aboutus', async (req, res) => {
    try {
        const admins = await User.find({ isAdmin: true });
        res.render('aboutus', { admins });
    } catch (error) {
        console.error('Error fetching admins:', error);
        res.status(500).send('Internal error');
    }
});

// -------------------------------------------------------------------

app.get('/logout', (req, res) => {
    req.session.destroy();
    res.redirect('/');
});

function isAuthenticated(req, res, next) {
    if (req.session.userId) {
        return next();
    }
    res.redirect('/login');
}

async function checkLockedAndArchived(req, res, next) {
    
    try {

        if (!req.session.userId) {
            return res.redirect('/');

        }

        const findUser = await User.findById(req.session.userId);
        if (findUser && (!findUser.isLocked && !findUser.isArchived)) {
            return next();
        }
          req.session.user = findUser;
          req.session.profileView = findUser;
        res.redirect(`/profile`);
    } catch (error) {
        console.error(error);
        res.status(500).send('Internal Server Error');
    }
}


app.get('/post', isAuthenticated, checkLockedAndArchived, (req, res) => {
    const message = req.session.error || null;//setting message to session error
    req.session.error = null; //reseting the session error to null for later use
    const userId = req.session.userId
    const user = req.session.user
    res.render('thread', { message, userId, user });
});
//Create new thread
const multer = require('multer');
const { Buffer } = require('buffer');

// mongoose.connect already connected on top

// const storage = multer.memoryStorage(); //storage for base64
const storage = multer.diskStorage({ //storage for /uploads
    destination: (req, file, cb) => {
        cb(null, 'uploads/');
    },
    filename: (req, file, cb) => {
        const uniqueSuffix = Date.now() + '-' + Math.round(Math.random() * 1E9);
        cb(null, uniqueSuffix + '-' + file.originalname);
    }
});

const fileFilter = (req, file, cb) => {
    const fileTypes = /jpeg|jpg|png/;
    const mimeType = fileTypes.test(file.mimetype);
    const extname = fileTypes.test(path.extname(file.originalname));

    if (mimeType && extname) {
        // If the file format is allowed, accept the file
        return cb(null, true);
    }
    //Custom error message
    return cb(new Error('Invalid file type. Please choose jpeg/JPG/png'));
    // If the file format is not allowed, render the signup page with an error message
    // res.render("profile_editor", { message: "Check the file format and size below 5kb"});
};

const upload = multer({
    storage: storage,
    fileFilter: fileFilter,
    limits: { fileSize: 1024 * 1024 * 1 }
});



const uploadErrorHandlerThread = (err, req, res, next) => {
    if (err instanceof multer.MulterError) {
        if (err.code === 'LIMIT_FILE_SIZE') {
            req.session.error = 'File too large. Max size 1MB'
            console.log("Upload error handler error: " + err);
            return res.redirect('/post');
        }
    }
    if (err.message === "Invalid file type. Please choose jpeg/JPG/png") {
        req.session.error = "Invalid file type. Please choose jpeg/JPG/png";
        console.log("Upload error handler error: " + err.message);
        return res.redirect('/post');
    }
    next();
};
const uploadErrorHandlerPost = (err, req, res, next) => {
    if (err instanceof multer.MulterError) {
        if (err.code === 'LIMIT_FILE_SIZE') {
            req.session.error = 'File too large. Max size 1MB'
            console.log("Upload error handler error: " + err);
            return res.redirect('/latest');
        }
    }
    if (err.message === "Invalid file type. Please choose jpeg/JPG/png") {
        req.session.error = "Invalid file type. Please choose jpeg/JPG/png";
        console.log("Upload error handler error: " + err.message);
        return res.redirect('/latest');
    }
    next();
};

// Serve static files from the 'uploads' directory
app.use('/uploads', express.static('uploads'));

//File filter only accepting png, jpg, jpeg
//THREAD v2: img served from /uploads
app.post('/post', isAuthenticated, upload.single('media'), uploadErrorHandlerThread, async (req, res) => {
    const { title, content, media } = req.body;
    console.log(media);
    try {
        //Check for no files uploaded/ wrong file format will also result in a empty file upload
        if (req.session.error) {
            return res.redirect('/post');
        }
        if (!req.file) {
            var mediaURL = null;
        } else {
            // const mediaURL = `data:${req.file.mimetype};base64,${req.file.buffer.toString('base64')}`;
            var mediaURL = `/uploads/${req.file.filename}`; //v2
        };
        //using var to let mediaURL be accessed outside of the if-else block
        const newThread = new Thread({
            title,
            content,
            mediaURL,
            createdBy: req.session.userId
        });

        await newThread.save();
        res.redirect('/');
    } catch (error) {
        console.log("Error while creating thread: " + error);
        res.send(error);
    }
});

app.get('/thread/:id', async (req, res) => {
    try {
        const threadId = req.params.id;
        const page = parseInt(req.query.page) || 1;
        const limit = 10;
        const thread = await Thread.findById(threadId)
            .populate('createdBy')
            .populate({
                path: 'replies',
                match: { isArchived: false },
                options: {
                    skip: (page - 1) * limit,
                    limit: limit,
                },
                populate: [
                    {
                        path: 'createdBy',
                        model: 'User'
                    },
                    {
                        path: 'parentReply',
                        populate: {
                            path: 'createdBy',
                            model: 'User'
                        }
                    },
                    {
                        path: 'replies',
                        match: { isArchived: false },
                        populate: [
                            {
                                path: 'createdBy',
                                model: 'User'
                            },
                            {
                                path: 'parentReply',
                                populate: {
                                    path: 'createdBy',
                                    model: 'User'
                                }
                            }
                        ]
                    }
                ]
            });

        if (thread.isArchived) {
            return res.redirect('/');
        }

        const filter = {
            thread: threadId,
            isArchived: false // Exclude archived replies
        };
        console.log('Counting documents with filter:', filter);

        const totalReplies = await Reply.countDocuments(filter);
        const totalPages = Math.ceil(totalReplies / limit);
        const message = req.session.error || null;
        req.session.error = null; // Reset session error

        res.render('latestNew', {
            message,
            thread,
            currentPage: page,
            totalPages: totalPages,
            user: req.session.user,
            userId: req.session.userId,
            otherUser: req.session.profileView,
            formatDate: formatDate
        });
    } catch (error) {
        console.error(error);
        res.status(500).send(error);
    }
});




//POST v1: img to base64  v2: img serve directly from /uploads

app.post('/reply/:id', isAuthenticated, upload.single('postImg'), uploadErrorHandlerPost, async (req, res) => {
    const { content, parentReplyId, postImg } = req.body;
    try {
        if (req.session.error) {
            return res.redirect(`/thread/${req.params.id}`);
        }
        if (!req.file) {
            var img = null;
        } else {
            // const img = `data:${req.file.mimetype};base64,${req.file.buffer.toString('base64')}`;
            var img = `/uploads/${req.file.filename}`; //v2
        }
        const newReply = new Reply({
            content,
            img,
            createdBy: req.session.userId,
            thread: req.params.id,
            parentReply: parentReplyId || null
        });

        await newReply.save();

        if (parentReplyId) {
            await Reply.findByIdAndUpdate(parentReplyId, { $push: { replies: newReply._id } });
        } else {
            await Thread.findByIdAndUpdate(req.params.id, { $push: { replies: newReply._id } });
        }

        res.redirect(`/thread/${req.params.id}`);
    } catch (error) {
        console.error(error);
        res.status(500).send(error);
    }
});

const uploadErrorHandlerReply = async (err, req, res, next) => {
    const parentReply = await Reply.findById(req.params.id);

    if (err instanceof multer.MulterError) {
        if (err.code === 'LIMIT_FILE_SIZE') {
            req.session.error = 'File too large. Max size 1MB'
            console.log("Upload error handler error 1: " + err);
            return res.redirect(`/thread/${parentReply.thread}`);
        }
    }
    if (err.message === "Invalid file type. Please choose jpeg/JPG/png") {
        req.session.error = "Invalid file type. Please choose jpeg/JPG/png";
        console.log("Upload error handler error 2: " + err.message);
        return res.redirect(`/thread/${parentReply.thread}`);
    }
    next();
};

app.post('/reply-to-reply/:id', isAuthenticated, upload.single('repToRepImg'), uploadErrorHandlerReply, async (req, res) => {
    const { content } = req.body;
    try {
        if (req.session.error) {
            console.log("Trying to return to latest");
            res.redirect(`/thread/${parentReply.thread}`);
        }
        if (!req.file) {
            var img = null;
        } else {
            // const mediaURL = `data:${req.file.mimetype};base64,${req.file.buffer.toString('base64')}`;
            var img = `/uploads/${req.file.filename}`; //v2
        };
        const parentReply = await Reply.findById(req.params.id);
        const newReply = new Reply({
            content,
            img,
            createdBy: req.session.userId,
            thread: parentReply.thread,
            parentReply: parentReply._id
        });
        console.log("Reply to reply saved with img:" + img);
        await newReply.save();
        await Reply.findByIdAndUpdate(req.params.id, { $push: { replies: newReply._id } });
        res.redirect(`/thread/${parentReply.thread}`);
    } catch (error) {
        console.log(error);
        res.status(500).send(error);
    }
});

app.get('/search', async (req, res) => {
    const query = req.query.query || '';
    console.log('Search query:', query);

    // Sorting parameters
    const sortBy = req.query.sortBy || 'date'; // Default sort field
    const order = req.query.order === 'desc' ? -1 : 1; // Default order is ascending

    try {
        const page = parseInt(req.query.page) || 1;
        const limit = 10;

        // Build the sorting object
        const sortOptions = {};
        sortOptions[sortBy] = order;

        const threads = await Thread.find({
            isArchived: false,
            $or: [
                { title: new RegExp(query, 'i') },
                { content: new RegExp(query, 'i') }
            ]
        })
            .populate('createdBy')
            .sort(sortOptions) // Apply sorting
            .skip((page - 1) * limit)
            .limit(limit);

        const totalThreads = await Thread.countDocuments({
            $or: [
                { title: new RegExp(query, 'i') },
                { content: new RegExp(query, 'i') }
            ]
        });
        const totalPages = Math.ceil(totalThreads / limit);
        const user = req.session.user;
        res.render('find', {
            threads,
            query,
            currentPage: page,
            totalPages,
            user: req.session.user,
            userId: req.session.userId,
            formatDate: formatDate,
            sortBy,
            user,
            order
        });
    } catch (error) {
        res.status(500).send(error);
    }
});

app.get('/sitemap', async (req, res) => {
    try {


        let sitemap = `
        <html>
            <head>
                <title>Sitemap</title>
                <style>
                    body { font-family: Arial, sans-serif; }
                    ul { list-style-type: none; }
                    a { text-decoration: none; }
                </style>
            </head>
            <body>
                <h1>Sitemap</h1>
                <ul>
                    <li><a href="/">Home</a></li>
                    <li><a href="/login">Login</a></li>
                    <li><a href="/register">Register</a></li>
                    <li><a href="/terms-of-use">Terms of use</a></li>
                    <li><a href="/privacy-policy">Privacy policy</a></li>
                    <li><a href="/aboutus>About us</a></li>
        `;
        sitemap += `
                </ul>
            </body>
        </html>
        `;

        res.send(sitemap);
    } catch (error) {
        console.error(error);
        res.status(500).send('Internal Server Error');
    }
});
app.post('/archive-thread/:id', isAuthenticated, async (req, res) => {
    try {
        const threadId = req.params.id;
        const thread = await Thread.findById(threadId);
        const user = req.session.user;

        thread.isArchived = true;
        await thread.save();

        res.redirect(`/thread/${threadId}`);
        console.log(thread.isArchived);
    } catch (error) {
        console.error(error);
        res.status(500).send(error);
    }
});


app.post('/unarchive-thread/:id', isAuthenticated, async (req, res) => {
    try {
        const threadId = req.params.id;
        const thread = await Thread.findById(threadId);
        thread.isArchived = false;
        await thread.save();

        res.redirect(`/thread/${threadId}`);
    } catch (error) {
        console.error(error);
        res.status(500).send(error);
    }
});


app.post('/archive-reply/:id', isAuthenticated, async (req, res) => {
    try {
        const replyId = req.params.id;
        const reply = await Reply.findById(replyId);

        reply.isArchived = true;

        await reply.save();

        res.redirect(`/thread/${reply.thread}`);
        console.log(reply.isArchived);
    } catch (error) {
        console.error(error);
        res.status(500).send(error);
    }
});

app.post('/unarchive-reply/:id', isAuthenticated, async (req, res) => {
    try {
        const replyId = req.params.id;
        const reply = await Reply.findById(replyId);

        reply.isArchived = false;
        await reply.save();

        res.redirect(`/thread/${reply.thread}`);
    } catch (error) {
        console.error(error);
        res.status(500).send(error);
    }
});


//get controller functions from controllers index
const { login, getLogin, profileFinder, getProfile, getProfileEditor, editProfile, editPfp, getAdminUI, lockUser, unlockUser, archiveUser, unArchiveUser, guideController } = require("./controllers/index");

//Middlewares
const isAdminCheck = require("./middlewares/isAdmin");
const { match } = require('assert');

app.get("/", getLogin);

app.post('/profileFinder/:id', profileFinder);

app.get("/profile", getProfile);

app.post("/login", login);

app.get('/profile_editor', isAuthenticated, getProfileEditor);

app.post('/profile/edit/', checkLockedAndArchived, editProfile);

app.post('/profilePic-edit', editPfp);

app.get('/adminUI', isAdminCheck, getAdminUI);

app.post('/user/:id/lock', lockUser);

app.post('/user/:id/unlock', unlockUser);

app.post('/user/archive', archiveUser);

app.post('/user/unArchive', unArchiveUser);

app.post('/admin/delete-post/:id', isAdminCheck, getAdminUI);

app.get('/guide', guideController);

app.get('/guide/:id', async (req, res) => {
    const guide = await Guide.findById(req.params.id);
    console.log(guide);
    // res.json(guide);
    const user = req.session.user;
    res.render('guideID', { guide, formatDate, user });
});

app.get('/post-guide', isAuthenticated, checkLockedAndArchived, (req, res) => {
    const message = req.session.error || null;//setting message to session error
    req.session.error = null; //reseting the session error to null for later use
    const userId = req.session.userId
    const user = req.session.user
    res.render('post-guide', { message, userId, user });
});

app.post('/guide', 
    isAuthenticated,
    isAdminCheck,
    async (req, res) => {
        const { title, content } = req.body;
        new Guide({
            title, content
        }).save();
        // res.json(saved);
        res.redirect('/guide');
});


const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
});

