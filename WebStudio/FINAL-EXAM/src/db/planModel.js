const { mongoose } = require("./mongoose");

// Define the meal schema
const mealSchema = new mongoose.Schema({
  // Your work starts here
  name: {
    type: String,
    required: true,
  },
  timeOfDay: {
    type: String,
    enum: ["Breakfast", "Lunch", "Dinner"],
    required: true,
  },
  mealType: {
    type: String,
    enum: ["DRINK", "FOOD"],
    required: true,
  },
  imageUrl: {
    type: String,
    required: true,
  },
});

const Meal = mongoose.model('Meal', mealSchema);

// Define the plan schema
const planSchema = new mongoose.Schema({
  meals: {
    type: [mealSchema],
    // type: mongoose.Schema.Types.ObjectId,
    ref: 'Meal',
    required: true,
  },
  // Your work starts here
  name: {
    type: String,
    required: true,
  },
});

// Create the plan model
// const Plan = mongoose.model("plan", planSchema);

const Plan = mongoose.model('Plan', planSchema);

module.exports = Plan;
