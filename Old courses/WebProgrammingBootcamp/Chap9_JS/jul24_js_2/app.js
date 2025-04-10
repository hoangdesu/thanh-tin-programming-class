// const tin = {
//     firstName: 'Tín',
//     lastName: 'Đỗ',
//     hasAGirlfriend: true,
//     birthYear: 2004
// }

// console.log(tin.lastName);

// // String interpolation

// // Do Thanh Tin
// console.log(`${tin.lastName} Thành ${tin.firstName}`);

// console.log(student.hobbies[1])

// alert(screen.width)

// prompt('enter sth')


// 1. select an element from the DOM
const helloButton =  document.querySelector('#hello-button');
const byeButton = document.querySelector('#goodbye-button');


// 2. attach an event listener
helloButton.addEventListener('click', () => {
    console.log('clicked on button hello!');
    alert('HELLO!!!')
});

// byeButton.addEventListener('mouseleave', () => {
//     console.log('mouse leave event');
//     alert('BYEEEEE');
// })

const nameInput = document.getElementById('name-input');
const sayHelloNameButton = document.getElementById('hello-name-button');

sayHelloNameButton.addEventListener('click', () => {
    const name = nameInput.value;
    // console.log('hello ' + name);
     
    let message;
    if (name) {
        message = `Hello ${name}, have a nice day!`;
    } else {
        message = 'Please enter your name in the box';
    }
    
    alert(message);
})


// Exercise; login form
// user: tindo
// password: tindeptra1

// => if ok alert('Welcome in!')
// => if wrong alert('Wrong credentials')

