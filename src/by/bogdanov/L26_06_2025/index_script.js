//const element = document.getElementById('name'); // сохранение в переменную
//element.textContent = 'Сергей'; // изменение текста
//element.style.color = 'red'; // изменение цвета
//element.setAttribute('data-info', '123'); // добавление атрибута
//const div = document.createElement('div'); // создание эдемента
//div.textContent = 'Новый блок с текстом'; // Добавление текса
//body.appendChild(div); // добавление элемента
//div.remove(); // Удаление элемента
// btn.addEventListener('click', () => {alert('Кнопка нажата')}); // назначение события
// btn.addEventListener('mouseover', () => {document.getElementById('name').style.color = 'red'}); при наведении меняет цвет
// btn.addEventListener('mouseout', () => {document.getElementById('name').style.color = 'black'}); при отпускании
document.addEventListener('DOMContentLoaded', () =>{
console.log('Dom полностью загружен');
const userInput = document.getElementById('userInput');
const mainText = document.getElementById('mainText');
const itemList = document.getElementById('itemList');
const mainHeader = document.getElementById('mainHeader');
const changeTextBtn = document.getElementById('changeTextBtn');
const addListItemBtn = document.getElementById('addListItemBtn');
const highlightHeaderBtn = document.getElementById('highlightHeaderBtn');
const removeLastItemBtn = document.getElementById('removeLastItemBtn');

//Меняет текст по клику на кнопку
changeTextBtn.addEventListener('click', ()=>{
const inputValue = userInput.value;
mainText.textContent = inputValue ? inputValue : 'Введите текст в поле!';
})

// добавляет элемент при клике на кнопку
addListItemBtn.addEventListener('click', ()=>{
const newItem = document.createElement('li');
newItem.textContent = `Элемент ${itemList.children.length + 1}`;
itemList.appendChild(newItem);
})

// замена цвета
highlightHeaderBtn.addEventListener('click', ()=>{
mainHeader.classList.toggle('highlight');
})

// удаление последнего элемента
removeLastItemBtn.addEventListener('click', ()=>{
if(itemList.lastChild){
itemList.removeChild(itemList.lastChild);
}
})

//
mainHeader.addEventListener('mouseover', ()=> {
mainHeader.style.color = 'red'
})

mainHeader.addEventListener('mouseout', ()=> {
mainHeader.style.color = ''
})

})