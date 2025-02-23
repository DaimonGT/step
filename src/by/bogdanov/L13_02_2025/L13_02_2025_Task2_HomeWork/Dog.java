package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

public class Dog extends Pet {
    public Dog(String name, String species, int age, String holderName) {
        super(name, species, age, holderName);
    }

    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав");
    }

    public void move() {
        System.out.println(getName() + " бегает на четырёх лапах");
    }

    public void eat() {
        System.out.println(getName() + " ест собачий корм");
    }
}
