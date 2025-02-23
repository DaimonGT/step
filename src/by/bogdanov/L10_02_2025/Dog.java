package by.bogdanov.L10_02_2025;
// класс, который наследует свойста и методы класса Animal
public class Dog extends Animal {
    // обязательно конструктор
    public Dog(String name, String species, int age) {
        super(name, species, age);
    }

    // обязательно абстрактные методы
    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав!");
    }

    public void move() {
        System.out.println(getName() + "бегает на четырех лапах.");
    }

    public void eat() {
        System.out.println(getName() + " ест собачий корм.");
    }


}
