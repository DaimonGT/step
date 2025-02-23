package by.bogdanov.L23_12_2024;

import java.util.Scanner;

/*Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.*/
public class HomeWork12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a >= b && a >= c && a >= d) {
            System.out.println(a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println(b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }

    }
}
