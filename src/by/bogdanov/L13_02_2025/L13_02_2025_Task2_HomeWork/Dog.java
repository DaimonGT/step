package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

public class Dog extends Pet {

    private static String species = "Собака";

    public Dog(String name, int age) {
        super(name, species, age);
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
