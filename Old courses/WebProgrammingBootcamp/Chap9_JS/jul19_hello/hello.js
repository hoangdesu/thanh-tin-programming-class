console.log('hello')
console.error('error!!!')

// print()

// syntax: cú pháp
// System.out.println("");

const button = document.querySelector('#click')

button.addEventListener('click', () => {
    alert('sup bro')
})

// Variables: biến

// String, int, float, boolean, ArrayList<String>...
// String name = "";
// int age = 19;

// let & var


var myName = "Tin"     // ES5
let age = 19           // ES6
let isSingle = false;

myName = 'Tin Do' // re-assign
// myName = 20 // k quan tam data type
// myName = true;

console.log('Hi my name is ' + myName)
console.log('I am ' + age + ' years old');

// Data types:
// - string
// - number
// - boolean

let hi;

console.log(hi);

hi = {};
console.log(typeof hi);
console.log(typeof myName);
console.log(typeof age);
console.log(typeof isSingle);



// const: constant 

const lastName = 'Do';
// lastName = 'Nguyen' // error

console.log(lastName);

/* PI = 3.14

age vs birthyear

let name: string = 'Tin'

name = 20

let name = prompt('enter your name:')

alert('hello ' + name)

*/


// const BIRTH_YEAR = 2004;

let a = 1;
let b = '1';

console.log(a + b); // str
console.log(a - b); // num

console.log(5);

console.log(1 == '1'); // true
console.log(1 === '1'); // false

console.log(1 != '2'); // true
console.log(1 !== '2'); // true

// strictly equal


let numb = 5;
// numb++;
// numb += 2;

// console.log(numb);
// ++numb;
// console.log(++numb);
// console.log(numb++);
numb = numb + 5;
console.log(numb);

// let isRaining = false;

// if (isRaining) {
//     console.log('stay at home');
// } else {
//     console.log('go outside');
// }

// let password = prompt('enter your password:')
// if (password === 'secret') {
//     // alert('welcome!')
//     document.querySelector('h1').innerText = 'Welcome!!!'
// } else {
//     // alert('wrong')
//     document.querySelector('h1').innerText = 'WRONG!'
// }

let ageInput = prompt('how old are you')

console.log(typeof ageInput);
let ageNumber = parseInt(ageInput)
// Number(str)
console.log(typeof ageNumber);

console.log(age, ageInput, myName, lastName, ageNumber);

let ageType = ageNumber >= 18 ? 'adult' : 'children'
console.log('ageType', ageType);

// 1. enter amount: 10
// 2. enter currency: vnd | usd
// 3. alert -> 10 usd = 250,000 vnd

