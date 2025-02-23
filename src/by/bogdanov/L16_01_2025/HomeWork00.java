package by.bogdanov.L16_01_2025;
/*1. Определить все ли элементы в массиве одинаковые. В консоль написать
Да элементы в массиве одинаковые или Нет элементы в массиве разные.*/
public class HomeWork00 {
    static public void main(String[] args) {
        int[] arr = {1, 1, 1, 2};
        boolean arrIdentical = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                arrIdentical = false;
                break;
            }
        }
        System.out.println(arrIdentical ? "Одинаковые" : "Разные");
    }
}
