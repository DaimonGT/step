package by.bogdanov.L23_12_2024;

import java.util.Scanner;
/*Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.*/
public class HomeWork17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int num = 0;
        if (a > 0) {
            num += 1;
        }
        if (b > 0) {
            num += 1;
        }
        if (c > 0) {
            num += 1;
        }
        System.out.println(num);
    }
}
