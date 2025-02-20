package by.bogdanov.L09_01_2025;

import java.util.Scanner;

/*Поиск числа
        Напишите программу, которая запрашивает у пользователя ввод чисел
до тех пор, пока не будет введено число 7. Если пользователь вводит число 5,
программа должна пропустить его и продолжить выполнение.*/
public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Введите число");
            num = sc.nextInt();
            if (num == 5) {
                continue;
            }
            if (num == 7) {
                System.out.println("Вы ввели 7, завершение цикла");
                break;
            }
        }
    }
}

