const express = require('express');

const app = express();
const PORT = 4567;

app.use(express.urlencoded()); // middleware để xử lý form data
// Middleware: trung gian, chạy giữa các request và response

// request -> middleware -> response


app.get('/', (req, res) => {
    let template = `
    <form action="/login" method="POST">
        <div>
            <label for="">Username</label>
            <input type="text" name="username">
        </div>
        <div>
            <label for="">Password</label>
            <input type="password" name="password">
        </div>
        <button>Login</button>
    </form>
    `;
    res.send(template);
});

app.post('/login', (req, res) => {
    // req = request object: 
    console.log(req.body);

    // object destructuring
    const { username, password } = req.body;

    // req.body.username => username

    if (username === 'hoang' && password === 'deptrai')
        return res.send('Welcome Hoang!');
    else
        return res.send('Login failed.')

    // res.send('server received POST /login');
})


app.listen(PORT, () => {
    console.log(`App running at http://localhost:${PORT}`);
});

