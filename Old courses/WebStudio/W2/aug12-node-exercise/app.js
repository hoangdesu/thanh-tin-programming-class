// enter your username: brian
// enter your password: watever

// login successfully!



// enter your username: brian
// enter your password: idontknow

// login failed!



// enter your username: tindo
// enter your password: watever

// login failed!

const prompt = require("prompt-sync")({ sigint: true });

const yourName = prompt("What is your name: ");
console.log(`Hello ${yourName}!`);