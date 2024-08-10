const fs = require('fs'); // file system

const myFile = fs.readFileSync('./dataFolder/data.txt')
console.log(myFile.toString());