// 1. enter distance: 
// 2. enter speed:
// 3. display time taken

const distance = prompt('Enter distance: ');
const speed = prompt('Enter speed: ');

const timeTaken = Number(distance) / Number(speed);

// alert(timeTaken + ' hours');

const hours = Math.floor(timeTaken);
const floatTimeTaken = timeTaken % 1;
const minutes = floatTimeTaken * 60;

// console.log(intTimeTaken, floatTimeTaken);
console.log(timeTaken);
// console.log(minutes);


if (minutes === 0) {
    alert('Time taken: ' + hours + ' hours')
} else {
    alert('Time taken: ' + hours + ' hours ' + minutes + ' minutes')
}


// 2.5
// 2 -> int
// 0.5 -> float

// Math.floor()
// parseInt(num)