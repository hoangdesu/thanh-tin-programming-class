const express = require('express');
const router = express.Router();
const { isAdmin } = require('../middleware/authMiddleware');
const Post = require('../models/postModel');
const user = { isAdmin: true };
// Get guide page (list of posts)
router.get('/guide', async (req, res) => {
    const posts = await Post.find();
    res.render('guide', { posts, user: req.user });
});

// Get specific post
router.get('/post/:id', async (req, res) => {
    const post = await Post.findById(req.params.id);
    res.render('post', { post, user: req.user });
});

// Admin create post
router.get('/admin/create-post', isAdmin, (req, res) => {
  if (req.user && req.user.isAdmin) {
    next();
} else {
    res.redirect('/login');
}
    res.render('create-post');
});

// Admin delete post
router.post('/admin/delete-post/:id', isAdmin, async (req, res) => {
    await Post.findByIdAndDelete(req.params.id);
    res.redirect('/guide');
});

module.exports = router;

// nếu là admin 

function isAdmin(req, res, next) {
  if (req.user && req.user.isAdmin) {
      next();
  } else {
      res.redirect('/login');
  }
}

module.exports = { isAdmin };
