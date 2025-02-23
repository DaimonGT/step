package by.bogdanov.L23_12_2024;

import java.util.Scanner;
/*Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
        "количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.*/
public class HomeWork15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("количество дней в году: 366");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("количество дней в году: 365");
        } else if (year % 4 == 0) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}
