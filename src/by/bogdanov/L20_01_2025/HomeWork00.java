package by.bogdanov.L20_01_2025;

import java.util.Arrays;
/*Копирует первый массив в новый массив (используйте Arrays.copyOf).
Копирует часть массива (например, первые 3 элемента).
Пример:
Ввод: [1, 2, 3, 4, 5]
Результат: [1, 2, 3]*/
public class HomeWork00 {
    static public void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int [] array1 = Arrays.copyOf(array, 3);
        System.out.println(Arrays.toString(array1));
    }
}
