// console.log('hello from my server');

const express = require('express');
const app = express();

const PORT = 3002;

// ROOT / -> hello from my server

let counter = 0;
app.get('/', (req, res) => {
    console.log('> received a request:', counter);
    counter++;
    res.send('hello from my server');
});

app.get('/tin', (req, res) => {
    const firstName = 'Tin';
    const lastName =' Do';
    res.send(`hi my name is ${firstName} ${lastName}`);
})

// /hello/tin
// hello Tin!!

// /hello/hoang
// hello Hoang

// /hello/duy
// hello Duy

// path parameter

app.get('/hello/:name', (req, res) => {
    const name = req.params.name;
    res.send(`Hello ${name}!`);
})

// 'add/5/10'
// 5 + 10 = 15

app.listen(PORT, () => {
    console.log('Server running at http://localhost:' + PORT);
})
