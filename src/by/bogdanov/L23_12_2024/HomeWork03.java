package by.bogdanov.L23_12_2024;

import java.util.Scanner;

/*Напишите программу, которая реализует простой калькулятор. Пользователь вводит два числа и оператор
 (+, -, *, /), программа выводит результат. Используйте оператор switch. (char operator = scanner.next().charAt(0);)*/
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double b = sc.nextDouble();
        double c;
        switch (operator) {
            case '*':
                c = a * b;
                System.out.println(c);
                break;
            case '/':
                if (b != 0) {
                    c = a / b;
                    System.out.println(c);
                } else
                    System.out.println("Делить на 0 нельзя");
                break;
            case '-':
                c = a - b;
                System.out.println(c);
                break;
            case '+':
                c = a + b;
                System.out.println(c);
        }

    }
}
