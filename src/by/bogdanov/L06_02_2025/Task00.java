package by.bogdanov.L06_02_2025;

public class Task00 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Samsung", "M31", 15, 2);
        System.out.println(smartphone1.toString());
        System.out.println("Состояние: " + smartphone1.getStatus());
        smartphone1.turnOn();
        System.out.println("Состояние: " + smartphone1.getStatus());
        smartphone1.turnOff();
        System.out.println("Состояние: " + smartphone1.getStatus());
        System.out.println();

        Laptop laptop1 = new Laptop("Xiomy", "redmibook pro 16", 99, 15);
        System.out.println(laptop1.toString());
        System.out.println("Состояние: " + laptop1.getStatus());
        laptop1.turnOn();
        System.out.println("Состояние: " + laptop1.getStatus());
        laptop1.turnOff();
        System.out.println("Состояние: " + laptop1.getStatus());
        System.out.println();

        Television television1 = new Television("Витязь", "ML-15", 52, 8);
        System.out.println(television1.toString());
        System.out.println("Состояние: " + television1.getStatus());
        television1.turnOn();
        System.out.println("Состояние: " + television1.getStatus());
        television1.turnOff();
        System.out.println("Состояние: " + television1.getStatus());

    }
}
