package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

public class Bird extends Pet {
    public Bird(String name, String species, int age, String holderName) {
        super(name, species, age, holderName);
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
