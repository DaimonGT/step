package by.bogdanov.L13_01_2025;

import java.util.Arrays;
import java.util.Scanner;

// если а = 3, то вывести индекс, если в массиве нет числа 3, то вывести -1
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int a = 3;
        int b = -1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                b = i;
                break;
            }
        }
        System.out.println(b);
    }
}
