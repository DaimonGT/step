package by.bogdanov.L13_01_2025;

import java.util.Scanner;
// В массив задать 10 чисел и затем вывести в обратном порядке
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int num ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            num = arr[i];
            System.out.print(num + " ");
        }
    }
}
