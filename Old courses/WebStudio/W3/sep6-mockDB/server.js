const fs = require('fs'); // file system

const fileContent = fs.readFileSync('./data/programming_languages.json', 'utf-8');

console.log(fileContent); // string

// console.log(fileContent[0]); // string -> character

const programmingLanguageList = JSON.parse(fileContent);

console.log(programmingLanguageList);

console.log(programmingLanguageList[2]); 


const express = require('express');

const app = express();
const PORT = 6969;

// root endpoint
app.get('/', (req, res) => {
    // res.send('sup');
});

app.listen(PORT, () => {
    console.log(`App running at http://localhost:${PORT}`);
})
