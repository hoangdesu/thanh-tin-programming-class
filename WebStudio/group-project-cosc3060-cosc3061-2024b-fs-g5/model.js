const mongoose = require('mongoose');

const userSchema = new mongoose.Schema({
    name: { type: String, required: true, unique: true },
    password: { type: String, required: true },
    email: { type: String, required: true, unique: true },
    displayName: { type: String },
    resetPasswordToken: { type: String },
    resetPasswordExpires: { type: Date },
    isAdmin: { type: Boolean, default: false },
    isLocked: { type: Boolean },
    isArchived: { type: Boolean, default: false },
    status: { type: String },
    description: { type: String },
    photo: { type: String, default: "/images/logo.png"}
});

const threadSchema = new mongoose.Schema({
    title: { type: String, required: true },
    content: { type: String, required: true },
    mediaURL: { type: String },
    createdBy: { type: mongoose.Schema.Types.ObjectId, ref: 'User' },
    date: { type: Date, default: Date.now },
    isArchived: { type: Boolean, default: false },
    replies: [{ type: mongoose.Schema.Types.ObjectId, ref: 'Reply' }]
});

const replySchema = new mongoose.Schema({
    content: { type: String, required: true },
    img: { type: String },
    createdBy: { type: mongoose.Schema.Types.ObjectId, ref: 'User', required: true },
    thread: { type: mongoose.Schema.Types.ObjectId, ref: 'Thread', required: true },
    parentReply: { type: mongoose.Schema.Types.ObjectId, ref: 'Reply', default: null },
    date: { type: Date, default: Date.now },
    isArchived: { type: Boolean, default: false },
    replies: [{ type: mongoose.Schema.Types.ObjectId, ref: 'Reply' }]
});

const guideSchema = new mongoose.Schema({
    title: String,
    content: String,
 }, {
     timestamps: true
 });

const User = mongoose.model('User', userSchema);
const Thread = mongoose.model('Thread', threadSchema);
const Reply = mongoose.model('Reply', replySchema);
const Guide = mongoose.model('Guide', guideSchema);

module.exports = { User, Thread, Reply, Guide };
