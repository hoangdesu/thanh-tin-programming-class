// addEventListener

// Events:
// 'click'
// 'mouseenter'
// 'mouseleave'

const clickMe = document.querySelector('#btn-clickme');

clickMe.addEventListener('click', () => {
    alert('wassup!')
}) 

clickMe.addEventListener('mouseenter', () => {
    clickMe.style.cursor = 'pointer';
    // document.body.style.backgroundColor = 'red';
    clickMe.style.backgroundColor = 'red';
})

clickMe.addEventListener('mouseleave', () => {
    clickMe.style.cursor = 'normal';
    // document.body.style.backgroundColor = 'transparent';
    clickMe.style.backgroundColor = 'transparent';
})


// Event: 'change' => 'keydown' => 'input'
const pwd1 = document.querySelector('#pwd1');
const pwd2 = document.querySelector('#pwd2');
const info = document.querySelector('#info');

pwd2.addEventListener('input', () => {
    // console.log(pwd2.value);
    if (pwd2.value === pwd1.value) {
        info.style.color = 'green';
        info.textContent = 'Good password ✅';
    } else {
        info.style.color = 'red';
        info.textContent = 'Passwords must match ❌';
    }
})

