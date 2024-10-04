// To enable the .env
require('dotenv').config();
const path = require('path');


// App setup
const express = require('express');
const app = express();


// SETUP APP

// su dung engine ejs
app.set('view engine', 'ejs');
// app.set('views', path.join(__dirname, 'views'));

// khai báo folder public là tĩnh (static) -> middleware
app.use(express.static('public'))

// Home endpoint
app.get('/', function (req, res) {
  res.render('index');
});


// Meal endpoint
app.get('/meal/:name', function (req, res) {
  res.render('meal');
});


// Start the server
const port = process.env.PORT || 3000;

console.log(process.env.MONGODB_CONNECTION_STRING);


app.listen(port, () => {
  console.log(`Server started on: http://localhost:${port}`);
});
