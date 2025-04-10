let firstName = 'Hoang';
let lastName = "Nguyen";
let middleName = `Quoc`;

// let fullName = lastName + ' ' + middleName + ' ' + firstName;
// console.log(fullName);

// String interpolation | Template literals 

// '' : single-quote
// "" : double-quotes
// `` : backtick -> string interpolation

let fullName = `${lastName} ${middleName} ${firstName}`;
console.log(fullName);

// Object: container for many properties (fields)

const tin = {
    firstName: 'Tín',
    lastName: 'Đỗ',
    hasAGirlfriend: true,
    birthYear: 2004
}

// console.log(tin.firstName + ' ' + tin.lastName); // string concatenation
let introduction = `Hi my name is ${tin.firstName} ${tin.lastName}. I was born in ${tin.birthYear} and I ${tin.hasAGirlfriend ? 'have' : 'don\'t have'} a girlfriend`

console.log(introduction);

// ternary: short if-else

// condition ? true : false


