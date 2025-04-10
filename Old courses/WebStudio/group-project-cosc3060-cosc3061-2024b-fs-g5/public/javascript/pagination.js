document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById('form-page');
    const inputPage = document.getElementById('input-page');
    const button = document.getElementById('jump-to-button');
    const popup = document.getElementById('popup');
    const totalPages = parseInt(form.getAttribute('data-total-pages'), 10);

    inputPage.addEventListener('input', function () {
        const pageValue = parseInt(inputPage.value, 10);
        if (pageValue > totalPages) {
            button.style.display = 'none'
            popup.style.display = 'block';
        } else {
            button.style.display = 'block'
            popup.style.display = 'none';
        }
    });
});

document.querySelectorAll('.cmt-btn').forEach(button => {
    button.addEventListener('click', function () {
        const formTemplate = document.getElementById('form-template');
        const parent = button.parentNode;
        let form = parent.querySelector('.reply-form');

        if (form) {
            form.style.display = form.style.display === 'none' ? 'flex' : 'none';
        } else {
            form = formTemplate.cloneNode(true);
            form.style.display = 'flex';
            form.id = '';

            if (button.hasAttribute('data-reply-id')) {
                form.action = `/reply-to-reply/${button.getAttribute('data-reply-id')}`;
            } else {
                form.action = `/reply/${button.getAttribute('data-thread-id')}`;
            }

            parent.appendChild(form);
        }
    });
});

const buttons = document.querySelectorAll('.show-hide-more-replies');
buttons.forEach(button => {
    button.addEventListener('click', () => {
        const repliesContainer = document.querySelector(`#reply-${button.dataset.replyId}`);
        
        if (repliesContainer.classList.contains('show')) {
            repliesContainer.classList.remove('show');
            repliesContainer.classList.add('hide');
            if (button.dataset.length == 1){
            button.textContent = `Click to see ${button.dataset.length} reply`;
            }
            else{
                button.textContent = `Click to see ${button.dataset.length} replies`;
            }
        } else {
            repliesContainer.classList.remove('hide');
            repliesContainer.classList.add('show');
            button.textContent = 'Click to close';
        }
    });
});



document.getElementById(`rep-box${subReply-id}`).addEventListener('click', function() {
    document.getElementById(`reply-${reply.id}`).scrollIntoView({ behavior: 'smooth' });
});
