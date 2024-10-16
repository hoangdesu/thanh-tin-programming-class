// To enable the .env
require("dotenv").config();
const Plan = require("./db/planModel");

// App setup
const express = require("express");
const app = express();

// SETUP APP

// su dung engine ejs
app.set("view engine", "ejs");
// app.set('views', path.join(__dirname, 'views'));

// khai báo folder public là tĩnh (static) -> middleware
app.use(express.static("public"));

// Home endpoint
app.get("/", async function (req, res) {
  const plan = await Plan.findOne({ name: "Daily Meal Plan #1" });
  console.log(plan);
  res.render("index", { plan });
});

app.post("/", async (req, res) => {
  // console.log('received POST /');
  // Math.random(): 0.0 -> 0.99

  const count = await Plan.countDocuments();
  console.log(count);

  const randomIndex = parseInt(Math.random() * count); // 0 -> 4

  const randomPlan = await Plan.findOne().limit(-1).skip(randomIndex);

  console.log("randomPlan:", randomPlan);

  res.render("index", { plan: randomPlan });
});

// Meal endpoint
app.get("/meal/:name", async function (req, res) {
  // 1. find a meal from the path param
  const { name } = req.params;

  const foundMeal = await Plan.findOne(
    {
      meals: {
        $elemMatch: {
          name: name,
        },
      },
    },
    { "meals.$": 1 }
  );

  // console.log("foundMeal:", foundMeal);

  // if found, render the template
  // if no meal found, render 404 not found

  if (foundMeal) {
    const meal = foundMeal.meals[0];
    res.render("meal", { meal: meal });
  } else {
    res.send('404 meal not found');
    // res.render('notFound')
  }
  
  
});

// Start the server
const port = process.env.PORT || 3000;

console.log(process.env.MONGODB_CONNECTION_STRING);

app.listen(port, () => {
  console.log(`Server started on: http://localhost:${port}`);
});
