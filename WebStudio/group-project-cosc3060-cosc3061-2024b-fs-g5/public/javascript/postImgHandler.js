let img = document.querySelector('#imgPlaceholder');
let file = document.querySelector('#postImg');

file.addEventListener('change', function () {
    const chosenFile = this.files[0];
    if (chosenFile) {
        const reader = new FileReader();
        reader.addEventListener('load', function () {
            img.setAttribute('src', reader.result);
        });
        reader.readAsDataURL(chosenFile);
    }
})