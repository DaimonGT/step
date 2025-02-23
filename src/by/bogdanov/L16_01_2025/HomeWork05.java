package by.bogdanov.L16_01_2025;

import java.util.ArrayList;

public class HomeWork05 {
    public static void main(String[] args) {
        int[] array = {4, 2, 1, 10};
        boolean sorted = false;
        boolean sorted1 = false;
        ArrayList<Integer> newArray = new ArrayList<>();

        // сортировка от меньшего к большему
        while (sorted == false) {
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int sort = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = sort;
                    sorted = false;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // сортировка от большего к меньшему
        while (sorted1 == false) {
            sorted1 = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    int sort = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = sort;
                    sorted1 = false;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // вывод массива до середины
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // вывод массива после середины
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
