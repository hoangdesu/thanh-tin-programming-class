// To enable the .env
require('dotenv').config();

// App setup
const express = require('express');
const app = express();
const mongoose = require('./db/mongoose');
const Plan = require('./db/planModel');

app.set('view engine', 'ejs');
app.use(express.static('public'))

// Home endpoint
app.get('/', async function (req, res) {
  const plans = await Plan.find();
  
  res.render('index', { plan: plans[0] });
});

// Meal endpoint
app.get('/meal/:name', async function (req, res) {
  const { name } = req.params;
  const meal = await Plan.findById(name); // wrong
  console.log(meal);
  
  res.render('meal', { meal });
});

// Start the server
const port = process.env.PORT || 3000;

app.listen(port, () => {
  console.log(`Server started on: http://localhost:${port}`);
});
