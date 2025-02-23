package by.bogdanov.L23_12_2024;

import java.util.Scanner;
/*
Напишите программу, которая запрашивает у пользователя 10 целых чисел и подсчитывает, сколько из них положительных,
отрицательных и нулей. Используйте оператор if-else и цикл for. (Вводить числа в цикле for)
*/
public class HomeWork05 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveNumber = 0;
        int negativNumber = 0;
        int zeroNumber = 0;
        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                positiveNumber += 1;
            } else if (num < 0) {
                negativNumber += 1;
            } else {
                zeroNumber += 1;
            }
        }
        System.out.println("Положительных чисел - " + positiveNumber);
        System.out.println("Отрицательных чисел - " + negativNumber);
        System.out.println("Нулей - " + zeroNumber);
    }
}
