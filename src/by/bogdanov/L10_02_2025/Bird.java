package by.bogdanov.L10_02_2025;
// класс, который наследует свойста и методы класса Animal
public class Bird extends Animal {

    // обязательно конструктор
    public Bird(String name, String species, int age) {
        super(name, species, age);
    }
    // обязательно абстрактные методы
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
