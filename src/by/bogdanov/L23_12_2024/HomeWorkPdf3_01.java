package by.bogdanov.L23_12_2024;

import java.util.Scanner;
/*Задание 1
        Написать программу, которая вычисляет для заданного N следующее выражение
        (показан пример для N = 4): 4^2 - 3^2 + 2^2 - 1^2 */
public class HomeWorkPdf3_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = N; i > 0; i -= 2) {
            int a = (i * i) - ((i - 1) * (i - 1));
            sum = sum + a;

        } System.out.println(sum);
    }
}
