package by.bogdanov.L13_01_2025;

import java.util.Arrays;
import java.util.Scanner;

// Найдите второй по величине элемент в массиве
public class Task08 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            num = array[i];
        }
        System.out.println(num);
    }
}
