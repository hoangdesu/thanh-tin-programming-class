// To enable the .env
require('dotenv').config({ path: '../.env' });

const mongoose = require('mongoose');

// Replace the placeholders with your MongoDB Atlas connection string details
// Change <sid> to your real student id, e.g., 2024b_final_v1234567
// const mongoUrl = "mongodb+srv://<username>:<password>@<host>/2024b_final_<sid>?retryWrites=true&w=majority&appName=Cluster0";

// const mongoUrl = "mongodb+srv://s3970879:Tkr9GRM44uNyJ8eA@cluster0.jnhpi.mongodb.net/2024b_final_tin_tutorial?retryWrites=true&w=majority&appName=Cluster0"; // tutorial db

// const mongoUrl = "mongodb+srv://s3970879:Tkr9GRM44uNyJ8eA@cluster0.jnhpi.mongodb.net/2024b_final_s3970879_tutorial?retryWrites=true&w=majority&appName=Cluster0"; // tin's db

// "mongodb+srv://s3970879:Tkr9GRM44uNyJ8eA@cluster0.jnhpi.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
//  "mongodb+srv://s3970879:Tkr9GRM44uNyJ8eA@cluster0.jnhpi.mongodb.net/2024b_final_s3970879?retryWrites=true&w=majority&appName=Cluster0";

// console.log('__dirname:', __dirname);


console.log('process.env.MONGODB_CONNECTION_STRING: ', process.env.MONGODB_CONNECTION_STRING);


const mongoUrl = process.env.MONGODB_CONNECTION_STRING;

// Connect to MongoDB Atlas
mongoose
  .connect(mongoUrl)
  .then(() => console.log('Connected to MongoDB Atlas'))
  .catch((err) =>
    console.error('Error connecting to MongoDB Atlas', err)
  );

module.exports = { mongoose };
