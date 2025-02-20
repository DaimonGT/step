package by.bogdanov.L09_01_2025;

import java.util.Scanner;
/*Задача 3: Сумма положительных чисел
        Напишите программу, которая запрашивает у пользователя ввод
чисел до тех пор, пока не будет введено отрицательное число.
Подсчитайте сумму всех введенных положительных чисел. Используйте break для
выхода из цикла.*/
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zeroNum = 0;
        int num;
        while (true) {
            num = sc.nextInt();
            if (num > 0) {
                zeroNum = zeroNum + num;
            } else{
                System.out.println("Завершение ввода");
                break;
            }
        }
        System.out.println(zeroNum);
    }
}
