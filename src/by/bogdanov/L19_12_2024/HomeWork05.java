package by.bogdanov.L19_12_2024;

public class HomeWork05 {
    public static void main(String[] args) {
        int a, b, c, d, number, numberDivision10;
        number = 237;
        a = number % 10;
        numberDivision10 = 237 / 10;
        b = numberDivision10 % 10;
        c = numberDivision10 / 10;
        d = a + b + c;
        System.out.println("Сумма цифр числа " + number + " = " + d);
    }
}
