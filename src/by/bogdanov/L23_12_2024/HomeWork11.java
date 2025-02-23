package by.bogdanov.L23_12_2024;

import java.util.Scanner;
/*Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.*/
public class HomeWork11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а:");
        int a = sc.nextInt();
        System.out.println("Введите число b:");
        int b = sc.nextInt();
        if (a > 0 && b >0) {
            System.out.println(1);
        } else if(a < 0 && b > 0) {
            System.out.println(2);
        } else if (a < 0 && b < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
