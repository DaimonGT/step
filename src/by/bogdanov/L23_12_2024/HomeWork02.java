package by.bogdanov.L23_12_2024;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя оценку (от 0 до 100) и
выводит соответствующий текст в зависимости от оценки. Используйте оператор if-else.
(болльше 90 Отлично, 75-90 Хорошо, 50-75 Удовлетворительно, меньше 50 неудовлетворительно)*/
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score > 90) {
            System.out.println("Отлично");
        } else if (score >= 75) {
            System.out.println("Хорошо");
        } else if (score >= 50) {
            System.out.println("Хорошо");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}
