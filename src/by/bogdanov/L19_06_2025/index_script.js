// коментарий
let message = 'Текст';
let a = 10;
let b = 2.2;
let c = true;

var g = 'Старый браузер'; // обозначение переменной для старых браузеров
const mess = 'Неизменяемая переменная'; // константа
console.log(mess);
c = String(c); // преобразование типов
let y = '23';
y = Number(y);
console.log(Number(true));
let n = Boolean(1);
console.log(n);
console.log(typeof 5); // какой тип
let age = 36;
if(age == 35){
    alert('Мне ' + age);
} else if(age == 36){
    console.log('Угадал');
}
else {
    console.log('Не угадал');
}

age > 30 ? console.log('Больше') : console.log('Меньше'); //тернарный оператор

let i = 5
while (i < 10) {
    console.log('Итерация ' + i);
    i++;
}

for (let i = 0; i < 3; i++) {
    console.log('FOR ' + i);
    if(i == 1) {
        break; //прерывагие цикла
    }
    
}

switch (i) {
    case 1:
        console.log('Один');
        break;
        case 2:
            console.log('Два');
            break;

    default:
        console.log('Другое');
}

//функции
function showMyAge(k=12) { //k=12 - значение по умолчанию
    console.log(k);
}

showMyAge(44);
for (let i = 0; i<10; i++) {
    showMyAge();
}

function sum(a, b) {
    return a + b;
}

let mySum = sum(2, 5);
console.log(mySum);

function st(a, b) {
    return a**b;
}

let zz = st(2, 2);
console.log(zz);