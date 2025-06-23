// Задача 1: Создание и вывод объекта
let student = {
    name: "Иван",
    age: 20,
    group: "ПИ-101"
}
console.log(student);

// Задача 2: Изменение объекта
let car = {
    brand: "Toyota",
    model: "Corolla",
    year: 2020
  };
  car.year = 2022;
  car.color = "синий";
  console.log(car);

  //Задача 3: Подсчёт свойств
  //Напишите функцию countProperties(obj), которая принимает объект и возвращает количество его свойств
  function countProperties(obj){
      let count = 0;
      for(key in obj) {
        count++
          }
          console.log(count);
      }
countProperties(car);
// 2-й способ
function countProperties1(obj) {
    return Object.keys(obj).length;
}
console.log(countProperties1(student));

//Задача 4: Вывод чисел от 1 до N
let n = 5;
for (let i = 1; i <= n; i++) {
console.log(i); 
}

//Задача 5: Сумма чисел в массиве
let numbers = [10, 20, 30, 40, 50];
let sum = 0;
for (const key of numbers) {
    sum += key;
}
console.log(sum);

// Задача 6: Поиск в массиве. Напишите цикл for, который выводит индекс элемента "апельсин"
let fruits = ["яблоко", "банан", "апельсин", "груша"];
for (let i = 0; i < fruits.length; i++) {
    if(fruits[i] === "апельсин"){
        console.log("Индекс апельсина: " + i);
        break;
    }
}

// Задача 7: Перебор свойств объекта

