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

//while
let i = 5
while (i < 10) {
    console.log('Итерация ' + i);
    i++;
}

// цикл for
for (let i = 0; i < 3; i++) {
    console.log('FOR ' + i);
    if(i == 1) {
        break; //прерывагие цикла
    }
    
}

// switch
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

// стрелочная функция
let sum2 = (a, b) => a + b;

// функция без параметров
let sayHi = () => alert('Привет');
//sayHi();

//Объект
let user = new Object();
let user2 = {};
let user3 = {
    name: "Дима",
    age: 33,
    email: "dima@MediaList.ru",
    "likes play pc games": true // ключ из нескольких слов
}
console.log(user3);
let play = user3["likes play pc games"]; //вызов свойства состоящий из нескольких слов
// обращаться к свойствам через "."
let userName = user3.name;
// добавление в объект свойства
user3.lastName = "Попов";
user3["like sleep"] = true;
console.log(user3);

// проверка свойства в объекте
if (user3.adres === undefined){

}
if("adres" in user3){

}

//проверка ключей
for (const key in user3) {
    console.log(key);
    console.log(user3[key]); //значение для каждого ключа
}

// копирование объекта
let user4 = user3;
console.log(user4);

//сравнение объектов, будет true т.к. ссылаются на одни объект
user3 == user4;

//копирование свойств из одного объекта в другой
let user7 = {};
for (const key in user3) {
    user7[key] = user3[key]
}
console.log(user7);

//копирование свойств из одного объекта в другой
let user8 = {};
Object.assign(user8, user3);
let user9 = Object({}, user3); // заменяет строчки 136, 137

//удаление свойства из объекта
delete user3["likes play pc games"];

//Объект в объекте
user3.adress = {
    city: "Vitebsk",
    street:{
        house: 12,
        label: "Fun Street"
    }
}

for(key in user3) {
    console.log(key);
    let u = user3[key];
    if(typeof u === 'object'){ // проверка объект или не объект
        for (key2 in u) {
            console.log(key2);
            let u2 = u[key2]
            if(typeof u2 === 'object'){
                for(key3 in u2){
                    console.log(key3);
                }
            }
        }
    }
}

let user10 = {
    name: "Luka",
    age: 3,
    sayHi() {
        alert("Привет, меня зовут " + this.name)
    }
}
//user10.sayHi();

//конструктор
function User12(name, age){
    this.name = name;
    this.age = age;
    this.sayHi = function(){
        alert("Меня зовут " + this.name)
    }
}
let user12 = new User12("Boris", 55);

//Примитив превращает в объект и вызывает метод
let str = "Привет";
console.log(str.toUpperCase());

//обезать до двух заноков после запятой
let num = 1.2345;
console.log(num.toFixed(2));

//Массивы
let arr = new Array();
let arr2 = ['Яблоко', 'Банан'];
arr2[2] = 'Слива'; // добавление в массив
arr2.length // длина массива
arr2[3] = ()=> alert("Привет");
arr2.push("Гранат"); //добавить элемент в конец списка
arr2.pop(); // удаляет последний элемент в списке
arr2.shift(); //удаляет первый элемент
arr2.unshift("Груша") // добавляет в начало массива

//перебор массива
for(let fruit of arr2){
    console.log(fruit);
}