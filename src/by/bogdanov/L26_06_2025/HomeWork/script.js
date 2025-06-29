// 1. Добавление скрипта
document.addEventListener('DOMContentLoaded', () =>{
console.log('Dom полностью загружен');
// 2. При клике на кнопку "Связаться" отображайте
//модальное окно или alert с сообщением: Отправить письмо на anna.ivanova@example.com?
btn.addEventListener('click', () => {alert('Отправить письмо на anna.ivanova@example.com?')});

// 3. Изменение возраста:
btnAge.addEventListener('click', () => {
let currentAge = parseInt(age.textContent);
currentAge += 1;
age.textContent = currentAge;
});

// 4. Добавление нового хобби:
addHobbyButton.addEventListener('click', () =>{
const hobbyInput = document.getElementById('hobbyInput');
const hobbyValue = hobbyInput.value;
if (hobbyValue === '') {
alert('Введите хобби!');
} else {
const hobbyList = document.getElementById('hobbyList');
const newHobbyItem = document.createElement('li');
newHobbyItem.textContent = 'Хобби: ' + hobbyValue;
hobbyList.appendChild(newHobbyItem);
}
});
// 5. Стилизация при наведении:
titleH1.addEventListener('mouseover', () => {document.getElementById('titleH1').style.color = 'blue'});
titleH1.addEventListener('mouseout', () => {document.getElementById('titleH1').style.color = ''});
})