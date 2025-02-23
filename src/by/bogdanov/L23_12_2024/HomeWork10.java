package by.bogdanov.L23_12_2024;

import java.util.Scanner;

/*Напишите программу, которая запрашивает у пользователя число N и вычисляет сумму
всех чисел от 1 до N, используя цикл for.*/
public class HomeWork10 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        int sumNum = 0;
        int Num1 = 0;
        for (int i = 1; i < num; i++) {
            sumNum = Num1 + i;
            Num1 = sumNum;
        }
        System.out.println("Сумма чисел до " + num + " = " + sumNum);
    }
}
