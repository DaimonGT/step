package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

public class Lion extends WildAnimal {
    public Lion(String name, String species, int age, String area) {
        super(name, species, age, area);
    }

    public void makeSound() {
        System.out.println(getName() + " рычит: Ррррр!");
    }

    public void move() {
        System.out.println(getName() + " быстро бежит по саванне.");
    }

    public void eat() {
        System.out.println(getName() + " ест мясо.");
    }
}
