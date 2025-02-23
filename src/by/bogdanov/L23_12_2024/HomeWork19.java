package by.bogdanov.L23_12_2024;

import java.util.Scanner;

/*Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
        8888
        8888
        */
public class HomeWork19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (n != 0) {
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j < n; j++) {
                    System.out.print(8);
                }
                System.out.println(8);
            }
        }
    }
}
