/*package by.bogdanov.L16_01_2025;

import by.bogdanov.utils.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        //deleteNumFromArray();
        //isPalindrome();
        numbersMass();

    }

    private static void deleteNumFromArray() {
        int[] intArray = ArrayUtil.generateIntArray(10, 0, 60); // () вводить значения
        int deleteIndex = 2; // Удалим элемент с индексом 2
        if (deleteIndex < intArray.length && deleteIndex >= 0) {
            int[] ints = new int[intArray.length - 1];
            for (int i = 0, j = 0; i < intArray.length; i++) {
                if (deleteIndex == i) {
                    continue;
                }
                ints[j] = intArray[i];
                j++;
            }
            System.out.println(Arrays.toString(ints));
        } else {
            System.out.println("Индекс вне диапозона");
        }
    }

    private static void isPalindrome() {
        int [] array = {1, 2, 3, 4, 3, 2, 1};
        boolean num = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 -i]) {
                num = false;
                break;
            }
        }
        System.out.println(num ? "Сим" : " Не сим");
    }
    *//*Вывести сколько раз встречается цифры в массиве.
        Например. 1- 2 раза, 2 - 3 раза, 4 - 6 раз*//*
    private static void numbersMass() {
        int num = 0;
        int [] arr = {1, 2, 3, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i] + 1) {
                num++;
            }
        }
        System.out.println();
    }
    }*/


