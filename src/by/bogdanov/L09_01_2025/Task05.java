package by.bogdanov.L09_01_2025;

/*Задача 2: Пропуск четных чисел
        Напишите программу, которая выводит все нечетные числа от 1 до 20,
используя цикл for. Пропустите четные числа с помощью оператора continue.*/
public class Task05 {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            while (true)
            if (i % 2 == 0) {
                continue;
            } else{
                System.out.println(i);
                i++;
                break;
            }
        }
    }
}
