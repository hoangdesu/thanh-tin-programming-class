let img = document.querySelector('#imgPlaceholder');
let file = document.querySelector('#media');

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

document.getElementById('media').addEventListener('change', function () {
    var fileName = this.files.length > 0 ? this.files[0].name : 'No file chosen';
    document.getElementById('file-name').textContent = fileName;
});

document.getElementById('postImg').addEventListener('change', function () {
    var fileName = this.files.length > 0 ? this.files[0].name : 'No file chosen';
    document.getElementById('file-name').textContent = fileName;
});