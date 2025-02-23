package by.bogdanov.L23_12_2024;

/*Напишите программу, которая выводит первые 10 чисел Фибоначчи с помощью цикла for.
1, 2, 3, 5, 8, 13, 21, 34, 55 */
public class HomeWork07 {
    static public void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(b + " ");
        for (int i = 1; i < 10; i++) {
            int nextNum = a + b;
            a = b;
            b = nextNum;
            System.out.print(nextNum + " ");
        }
    }
}
