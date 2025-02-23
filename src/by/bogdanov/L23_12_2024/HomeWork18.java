package by.bogdanov.L23_12_2024;

import java.util.Scanner;
/*Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:*/
public class HomeWork18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int num = 0;
        int num1 = 0;
        if (a != 0) {
            if (a > 0) {
                num += 1;
            } else {
                num1 += 1;
            }
        }
        if (b != 0) {
            if (a > 0) {
                num += 1;
            } else {
                num1 += 1;
            }
        }
        if (c != 0) {
            if (a > 0) {
                num += 1;
            } else {
                num1 += 1;
            }
        }
        System.out.println("Количество отрицательных чисел: " + num1);
        System.out.println("Количество положительных чисел:" + num);
    }
}
