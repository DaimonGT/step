package by.bogdanov.L09_01_2025;

import java.util.Scanner;
/*Прерывание цикла
        Напишите программу, которая запрашивает у пользователя ввод чисел,
пока не будет введено число 0. Если число 0 введено, программа должна
завершить ввод и вывести сообщение о завершении.*/
public class Task04 {
    public static void main(String[] args) {
        System.out.println("Введите число 0, чтобы выйти");
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            num = sc.nextInt();
            System.out.println("Вы ввели " + num);
            if (num == 0) {
                System.out.println("Завершение ввода");
                break;
            }
        }
    }
}