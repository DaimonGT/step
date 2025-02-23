package by.bogdanov.L13_01_2025;

import java.util.Scanner;
// сумма четных чисел в массиве
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum ++;
            }
        }
        System.out.println(sum);
    }
}
