package by.bogdanov.L23_12_2024;

/*Сумма чисел
Напишите программу, которая вычисляет и выводит сумму всех
четных чисел от 1 до 100 с помощью цикла for.*/
public class HomeWork01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}


