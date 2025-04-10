import mongoose from "mongoose";
import { Schema } from "mongoose";

const CONNECTION_STRING =
  "mongodb+srv://s3970879:Tkr9GRM44uNyJ8eA@cluster0.jnhpi.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

await mongoose.connect(CONNECTION_STRING);

const dbConnection = mongoose.connection;
dbConnection.once("open", (_) => {
  console.log(`Database connected: ${CONNECTION_STRING}`);
});

// định nghĩa cho data mới (schema)
const carSchema = new Schema({
    name: String,
    brand: String,
    price: Number,
});

// tạo 1 model từ định nghĩa xe
const Car = mongoose.model('Car', carSchema); // ten collection, schema dựa vào

// thực sự tạo 1 car object từ Car model CHỈ TRONG MEMORY, CHƯA THỰC SỰ LƯU VÀO DB
// const car1 = new Car({
//     name: '720 Spyder',
//     brand: 'McLaren',
//     price: 200_000,
// });

// console.log('car1:', car1);

// await car1.save(); // đợi cho car1 dc lưu vào db


// GET data from collection
// Tìm tất cả
const allCarsFromDb = await Car.find(); // returns an array

// console.log(allCarsFromDb);

let count = 0;
for (const car of allCarsFromDb) {
    if (car.brand === 'Mercedes') count++;
}
console.log(`Có ${count} xe Mercedes trong DB`);


// Tìm có chọn lọc
const mercedesCars = await Car.find({ brand: 'Mercedes' }); // array
console.log('mercedesCars:', mercedesCars);

const audiCars = await Car.find({ name: 'Audi' }); // array
console.log('audiCars',audiCars);


// Update data
// await Car.findOneAndUpdate({ _id: '66e7ea83cdb47e133e05c926' }, { name: 'Maybach' });