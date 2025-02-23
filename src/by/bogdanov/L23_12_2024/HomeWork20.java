package by.bogdanov.L23_12_2024;

import java.util.Scanner;

/*Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.*/
public class HomeWork20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a != b && a != c && b != c) {
            if ((a > b && a < c) || (a < b && a > c)) {
                System.out.println(a);
            } else if ((b > a && b < c) || (b < a && b > c)) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if (a == b && a ==c){
            System.out.println(a);
        } else {
            System.out.println("Нет среднего числа");
        }
    }
}
