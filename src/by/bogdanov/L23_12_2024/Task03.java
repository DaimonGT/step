package by.bogdanov.L23_12_2024;
/*Три числа

        Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
        Вывести на экран порядковый номер числа, отличного от остальных.
        Пример для чисел 4 6 6:
        1
        Пример для чисел 6 6 3:
        3*/
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a != b && a != c) {
            System.out.println("1");
        } else if (b != a && b != c) {
            System.out.println("2");
        } else
            System.out.println("3");
    }
}
