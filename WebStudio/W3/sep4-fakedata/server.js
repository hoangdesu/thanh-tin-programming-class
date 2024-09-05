const express = require('express');

const app = express();
const PORT = 4567;


const menu = ['com', 'pho', 'bun', 'banh', 'nuoc'];


// API: ... 
// -> trả về data thuần, ko có giao diện
app.get('/menu-api', (req, res) => {
    res.json(menu);
});


app.get('/menu-website', (req, res) => {
    let template = '<h1 style="color: red;">Restaurant Menu</h1>';
    template += '<ol>'; // ordered-list -> HTML

    // lặp qua mỗi món ăn trong menu
    // build string template theo dạng <li>{tên món}</li>

    for (food of menu) {
        template += `
        <li>
            <a href="/menu/${food}">${food}</a>
        </li>`;
    }

    template += '</ol>';

    // res.send(menu)
    res.send(template);
});


// ':food' -> path param
app.get('/menu/:food', (req, res) => {
    // nếu food mà khách order là 1 trong 3 món có trong menu
    // thì trả về câu 'order bún của bạn sắp xong'
    // nếu order ko có trong menu -> 'chúng tôi ko có món ... bạn order'

    const food = req.params.food;

    for (foodInMenu of menu) {
        if (food === foodInMenu)
            return res.send(`<h1>Order ${food} của bạn sắp xong!</h1>`);
    }

    return res.send(`<h1>Chúng tôi ko có món ${food} bạn order :(</h1>`);
});


app.listen(PORT, () => {
    console.log(`App running at http://localhost:${PORT}`);
})