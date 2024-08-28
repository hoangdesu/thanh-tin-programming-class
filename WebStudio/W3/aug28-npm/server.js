const express = require('express');

const app = express();
const PORT = 4321;

// root route
app.get('/', (req, res) => {
    res.send('hello from server')
});


app.get('/hi', (req, res) => {
    res.send('hi')
});

// facebook.com/Tindo
// facebook.com/hoangdayo
// => path parameter

// ko tao rung route cu the nhu the nay
// app.get('/tin')
// app.get('/hoang')

// using path param to extract userId
// :param
app.get('/user/:userId', (req, res) => {
    const userId = req.params.userId;

    console.log(userId);

    const users = ['tin', 'hoang', 'duy']; // fake user database

    for (let i = 0; i < users.length; i++) {
       if (userId === users[i]) {
            return res.send(`Welcome ${userId}!`);
        } 
    }

    return res.send('User ID not found');
    
})


// start server, LUON LUON DE O CUOI CUNG
app.listen(PORT, () => {
    console.log(`app running at http://localhost:${PORT}`);
});
