// NOTES:

// Trong package.json:
//     - "type": "commonjs" -> dùng syntax: require('package')
//         vd: const express = require('express')

//     - "type": "module" -> dùng syntax: import package from package
//         vd: import express from 'express'

// "type": "commonjs"
// const express = require('express');
// const ejs = require('ejs');
// const mongoose = require('mongoose');

import express from 'express';
import mongoose, { Schema } from 'mongoose';

const app = express();
const PORT = 6969;
const URI = 'mongodb+srv://s3970879:Tkr9GRM44uNyJ8eA@cluster0.jnhpi.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0';

await mongoose.connect(URI);
console.log('Connected to DB!');

const championSchema = new Schema({
    name: String,
    role: String,
    image: String
});

const Champion = mongoose.model('Champion', championSchema);

// set view engine to use ejs
app.set('view engine', 'ejs');

// middleware: để bóc tách thông tin từ form gửi từ client
app.use(express.urlencoded({ extended: true }));
app.use(express.json());

app.get('/', (req, res) => {
    // const foodList = ['sushi', 'ramen', 'sashimi'];
    // res.send(food);

    // {
    //     "_id": {
    //       "$oid": "66eed24d50b0efd12f74c1da"
    //     },
    //     "name": "Rolls-Royce",
    //     "year": 1999,
    //     "price": 37643735872367,
    //     "country": "American",
    //     "__v": 0
    //   }

    const foodList = [
        {
            id: '1',
            name: 'sushi',
            price: 100,
            image: 'https://static.blog.bolt.eu/LIVE/wp-content/uploads/2024/05/10110345/different-types-of-sushi-1024x536.jpg'
        },
        {
            id: '2',
            name: 'ramen',
            price: 30,
            image: 'https://glebekitchen.com/wp-content/uploads/2017/04/tonkotsuramenfront-500x375.jpg'
        },
        {
            id: '3',
            name: 'sashimi',
            price: 400,
            image: 'https://sushimiyabi.de/wp-content/uploads/alexplum_Sashimi_and_Sushi.jpg'
        }
    ];

    res.render('food', { foodList: foodList });
});


// using Express (server) + MongoDB (database) + EJS (template engine)
// 1 endpoint chỉ nên đảm nhiệm 1 nhiệm vụ
// lấy tất cả tướng trong DB
app.get('/champions', async (req, res) => {
    // const ahri = new Champion({
    //     name: 'Ahri',
    //     role: 'Mid',
    //     image: 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ahri_0.jpg'
    // });

    // await ahri.save();

    // const yi = new Champion({
    //     name: 'Master Yi',
    //     role: 'Jungle',
    //     image: 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/MasterYi_0.jpg'
    // });

    // await yi.save();

    // const zed = new Champion({
    //     name: 'Zed',
    //     role: 'Mid',
    //     image: 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Zed_0.jpg'
    // });

    // await zed.save();

    // await Champion.deleteMany({ name: 'Zed' });

    const championList = await Champion.find();

    console.log(championList);
    
    res.render('champions', { championList: championList });
});


// endpoint này dùng để nhận thông tin từ user, và lưu champion mới vào trong database
app.post('/champions', async (req, res) => {
    // console.log(req.body);

    // bóc tách thông tin từ các inputs từ phía client
    const { championName, role, imageUrl } = req.body;

    // tạo 1 tướng mới từ schema Champion (chỉ lưu trong memory, chưa lưu vào db)
    const newChamp = new Champion({
        name: championName,
        role: role,
        image: imageUrl
    });

    // lưu vào mongodb
    await newChamp.save();

    // reload lại trang để show con tướng mới
    res.redirect('/champions');
});


app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
})





