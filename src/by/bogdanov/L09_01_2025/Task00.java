package by.bogdanov.L09_01_2025;
// зона видимости
public class Task00 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            int b = 9;
            a = 99; // переменная а видна
            for (int j = 0; j < 20; j++) {
                a = 99; // переменная  а видна
            }
        }
        int b = 99; // новая переменная, переменна b в цикле недоступна
    }
}
