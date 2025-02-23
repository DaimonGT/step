package by.bogdanov.L23_12_2024;

import java.util.Scanner;

public class HomeWork09 {
    static public void main(String[] args) {
        System.out.println("Выберите направление конверсии:");
        System.out.println("1 - Цельсий в Фаренгейт");
        System.out.println("2 - Фаренгейт в Цельсий");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Введите число:");
        double num2 = sc.nextInt();
        switch (num1) {
            case 1:
                double fahrenheit = num2 * 9 / 5 + 32;
                System.out.println(num2 + " по цельсию это: " + fahrenheit + " по фарингейту");
                break;
            case 2:
                double celsius = (num2 -32) * 5 / 9;
                System.out.println(num2 + " по фарингейту: " + celsius + " по цельсию это");
                break;
        }
    }
}
