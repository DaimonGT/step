package by.bogdanov.L10_02_2025;

public class Task00 {
    public static void main(String[] args) {
        Bird bird = new Bird("Кеша", "Птица", 2);
        Cat cat = new Cat("Мурка", "Кот", 2);
        Dog dog = new Dog("Барсик", "Собака", 3);
        Animal[] animal = {bird, cat, dog};

        for (Animal animal1 : animal) {
            System.out.println(animal1);
            animal1.makeSound();
            animal1.move();
            animal1.eat();
            System.out.println();
        }
    }
}
