package by.bogdanov.L10_02_2025;

// класс, который наследует свойста и методы класса Animal
public class Cat extends Animal {
    // обязательно конструктор
    public Cat(String name, String species, int age) {
        super(name, species, age);
    }

    // обязательно абстрактные методы
    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " грациозно крадется.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест рыбу.");
    }
}
