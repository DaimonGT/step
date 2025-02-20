package by.bogdanov.L23_12_2024;

public class Task09 {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ; i++) {
            i = i * i;
            for (int j = 1; j < 10 ; j++) {
                int x = i * j;
                System.out.println(x + " * " + j + " = " + j);
            }

        }
    }
}
