package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

public class Cat extends Pet {

    public Cat(String name, String species, int age, String holderName) {
        super(name, species, age, holderName);
    }

    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу");
    }

    public void move() {
        System.out.println(getName() + " грациозно крадется");
    }

    public void eat() {
        System.out.println(getName() + " ест рыбу");
    }
}
