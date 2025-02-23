package by.bogdanov.L13_02_2025.L13_02_2025_Task1;

public class Cat extends Pet {

    public Cat(String name, String species, int age, String holderName) {
        super(name, species, age, holderName);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу");
    }

    @Override
    public void move() {
        System.out.println(getName() + " грациозно крадется");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест рыбу");
    }

}
