package by.bogdanov.L19_12_2024;

public class HomeWork04 {
    public static void main(String[] args) {
        int a, b;
        int n = 15;
        a = n % 3;
        b = n % 5;
        if (a == 0) {
            System.out.println("Число " + n + " делится на 3");
        } if (b == 0) {
            System.out.println("Число " + n + " делится на 5");
        } if (a == 0 && b == 0) {
            System.out.println("Число " + n + " делится на 3 и на 5");
        }
    }
}
