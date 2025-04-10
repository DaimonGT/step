package by.bogdanov.L10_04_2025;

public class SingletonExample {
    private static SingletonExample instance;

    //Приватный конструктор
    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
