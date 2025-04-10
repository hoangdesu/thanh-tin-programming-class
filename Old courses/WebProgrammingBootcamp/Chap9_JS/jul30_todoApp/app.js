// 1. Dùng 1 list để keep track những todos
// 2. Dùng JS để RENDER những element động vào container trên trang web

console.log('hello!');

let todos = ['Learn Javascript', 'Learn HTML', 'Study CSS'];

const container = document.querySelector('#todos-container');

// gắn thêm HTML vào container

// cách 1: tạo child element và gắn vào parent
// const li = document.createElement('li');
// // li.textContent = todos[0];
// li.textContent = 'hahahahhaha'

// container.appendChild(li)

// loop: for loop or list method forEach

// dinh nghia ham
function renderTodos() {
    // xoa cac todos cu trong container
    container.innerHTML = '';
    
    // lap qua cac todo, tao 1 <li> de gan vao container
    todos.forEach(todo => {
        const li = document.createElement('li'); 
        li.textContent =  '😎 ' + todo;

        // add an event listener on top of every li
        // khi click vao 1 li:
        //     - lọc todo bị click vào ra khỏi list
        //     - update list todos mới KO bao gồm cái todo đã bị xoá
        //     - render lại list mới
        li.addEventListener('click', () => {
            // console.log('clicked on: ', todo);
            const filteredTodos = todos.filter(listTodo => todo !== listTodo);
            console.log(filteredTodos);

            todos = filteredTodos;

            renderTodos();
        });

        container.appendChild(li)
    })
}

// gọi hàm
renderTodos();

const form = document.querySelector('#form');
// querySelector('#id cua input')

form.addEventListener('submit', (event) => {
    // form se submit data by default
    event.preventDefault();

    // console.log('suppp');
    // form.input
    // console.dir(form);
    // console.log(form);

    const textInput = form[0];
    console.log(textInput.value);

    todos.push(textInput.value);

    renderTodos();

    console.log(todos);

    // reset text input
    textInput.value = '';
})

