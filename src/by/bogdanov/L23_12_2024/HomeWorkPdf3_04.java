package by.bogdanov.L23_12_2024;

import java.util.Scanner;

public class HomeWorkPdf3_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
