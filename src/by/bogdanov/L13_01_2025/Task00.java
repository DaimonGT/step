package by.bogdanov.L13_01_2025;

import java.util.Arrays;

public class Task00 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int lenght = array.length;
        System.out.println(lenght);
        int a = array[5];
        for (int i = 0; i < array.length; i++) { // можно вместо array.length указывать lenght (переменную к которой присвоили длину массива)
            array[i] = i * 13; // заполнение массива
        }
        System.out.println(Arrays.toString(array)); // вывести массив в консоль
        int[] array2 = {1,2,3,4,5,6,7,8,9,12,13};
        System.out.println(Arrays.toString(array2));
        int array3[] = new int[2]; // так делать не надо
        int[] array4 = new int[]{1,2,3,4,5,6,7}; // сокр. способ заполнить массив
        array4[2] = 44; // присвоение нового значения значению с индексом 2
        System.out.println(Arrays.toString(array4));
        char[] chars = new char[]{'a', 'b', 'c'};
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            chars[i] = 'p';
            System.out.println(chars[i]);
        }
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
}
