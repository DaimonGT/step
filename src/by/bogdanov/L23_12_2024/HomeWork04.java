package by.bogdanov.L23_12_2024;

import java.util.Scanner;

/*Напишите программу, которая вычисляет факториал числа, введенного пользователем, с помощью цикла for.*/
public class HomeWork04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i > 0 ; i--) {
            if(i != 1)
            num = num * (i - 1);
        }
        System.out.println(num);
    }
}
