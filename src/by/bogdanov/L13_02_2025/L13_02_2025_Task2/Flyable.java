package by.bogdanov.L13_02_2025.L13_02_2025_Task2;

public interface Flyable {
    default void test() {
        System.out.println();
    }

    static void test2() {
        System.out.println();
    }
    void fly();
}
