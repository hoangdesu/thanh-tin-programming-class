console.log('working with API and fetch');

// Application Programming Interface: frontend <-API-> backend

const image = document.querySelector('#image');
const nameH1 = document.querySelector('#name');

let pokemonName = '103'

// get data from an API
// fetch(URL)
fetch('https://pokeapi.co/api/v2/pokemon/' + pokemonName)
    .then(res => res.json()) // convert response object to JSON format
    .then(data => {
        console.log(data);
        const pokemonImage = data.sprites.other['official-artwork']['front_default']
        image.src = pokemonImage;
        nameH1.textContent = data.name;
    })