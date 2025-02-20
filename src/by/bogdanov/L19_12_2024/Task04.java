package by.bogdanov.L19_12_2024;

public class Task04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        if (a == b || a == c) {
            System.out.println(a + " " + a);
        } else if (b == a || b == c) {
            System.out.println(b + " " + b);
        } else if (b == a && b == c) {
            System.out.println(a + " " + a + " " + a);
        } else {
            System.out.println("Цифры не равны");
        }
    }
}
