// console.log('hello from server file')

const express = require('express');

const app = express();
const PORT = 4567;

app.set('view engine', 'ejs');
app.use(express.static(__dirname + '/public'));

app.get('/', (req, res) => {
    // res.send('<h1>hello from server file</h1>')

    // takes in an HTML file, render full HTML
    res.render('index');
});

app.get('/hello/:name', (req, res) => {
    const name = req.params.name;

    console.log(name);

    const cars = ['lambo', 'ferrari', 'mclaren', 'mercedes', 'bmw'];
    
    res.render('hello', { userName: name, carList: cars });
});


app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
});
