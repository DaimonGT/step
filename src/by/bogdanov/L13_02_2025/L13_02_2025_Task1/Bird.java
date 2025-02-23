package by.bogdanov.L13_02_2025.L13_02_2025_Task1;

public class Bird extends Pet {
    public Bird(String name, String species, int age, String holderName) {
        super(name, species, age, holderName);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " чирикает: Чик-Чирик!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " летает в небе.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " клюет зерна.");
    }

}
