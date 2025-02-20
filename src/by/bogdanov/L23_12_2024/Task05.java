package by.bogdanov.L23_12_2024;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println(i + " - й вывод числа " + a);
        }
        sc.close();

    }
}
