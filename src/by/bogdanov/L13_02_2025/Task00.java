package by.bogdanov.L13_02_2025;

public class Task00 {
    public static void main(String[] args) {
        Pet dog = new Dog("Барсик", "Собака", 3, "Дима");
        Pet bird = new Bird("Кеша", "Птица", 1, "Саша");
        Pet cat = new Cat("Мурка", "Кот", 2, "Анна");
        WildAnimal lion = new Lion("Симба", "Лев", 5, "Африканская саванна");
        Animal[] animals = {lion, dog, bird, cat};

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
            animal.move();
            animal.eat();
            if (animal instanceof WildAnimal wildAnimal) {
                wildAnimal.hunt();
            } else if (animal instanceof Pet pet) {
                pet.play();
            }
            System.out.println();
        }
        System.out.println("Общее количество животных " + Animal.getTotalAnimals());
    }
}
