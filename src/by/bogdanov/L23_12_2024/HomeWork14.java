package by.bogdanov.L23_12_2024;

import java.util.Scanner;

/*Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
        "Треугольник существует." - если треугольник с такими сторонами существует.
        "Треугольник не существует." - если треугольник с такими сторонами не существует.*/
public class HomeWork14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}
