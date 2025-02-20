package by.bogdanov.L09_01_2025;

import java.util.Scanner;

/*Задача 5: Счетчик чисел
        Напишите программу, которая считает количество введенных пользователем
чисел до тех пор, пока не будет введено число 10. Используйте break для
выхода из цикла.*/
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        while (true) {
            num = sc.nextInt();
            System.out.println("Введите чесло " + num);
            if (num != 10) {
                sum = sum + num;
            } else {
                System.out.println("Вы ввели 10 - выход из цикла");
                break;
            }
        }
        System.out.println(sum);
    }
}
