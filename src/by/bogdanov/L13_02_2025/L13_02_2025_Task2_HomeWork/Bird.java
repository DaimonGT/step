package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

public class Bird extends Pet {

    private static String species = "Птица";

    public Bird(String name, int age) {
        super(name, species, age);
    }

    public void makeSound() {
        System.out.println(getName() + " чирикает: Чик-Чирик!");
    }

    public void move() {
        System.out.println(getName() + " летает в небе.");
    }

    public void eat() {
        System.out.println(getName() + " клюет зерна.");
    }
}
