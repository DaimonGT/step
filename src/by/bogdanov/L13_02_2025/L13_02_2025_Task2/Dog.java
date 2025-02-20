package by.bogdanov.L13_02_2025.L13_02_2025_Task2;

public class Dog extends Pet {
    public Dog(String name, String species, int age, String holderName) {
        super(name, species, age, holderName);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав");
    }

    @Override
    public void move() {
        System.out.println(getName() + " бегает на четырёх лапах");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест собачий корм");
    }
}
