const prompt = require("prompt-sync")({ sigint: true });
const fs = require('fs');

const data = fs.readFileSync('users.csv').toString();
// console.log(data);

const users = data.split('\n')
// console.log(users);

const usernameInput = prompt("Enter your username: ");
const passwordInput = prompt("Enter your password: ");

// users.forEach(user => {...})

let loginSuccess = false;

for (let i = 0; i < users.length; i++) {
    const user = users[i];
    const userData = user.split(',');
    const username = userData[0];
    const password = userData[1];
    
    // console.log('username:', username, '- password:', password);

    if (username === usernameInput && password === passwordInput) {
        loginSuccess = true;
        break;
    }
}

if (loginSuccess) {
    console.log('login successfully!');
} else {
    console.log('login failed...');
}