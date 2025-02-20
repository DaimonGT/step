package by.bogdanov.L13_02_2025.L13_02_2025_Task2;

public class Task00 {
    public static void main(String[] args) {
        Pet dog = new Dog("Барсик", "Собака", 3, "Дима");
        Pet dog1 = new Dog("Тузик", "Собака", 3, "Дима");
        Pet bird = new Bird("Кеша", "Птица", 1, "Саша");
        Pet cat = new Cat("Мурка", "Кот", 2, "Анна");
        Pet cat1 = new Cat("Марта", "Кот", 2, "Анна");
        WildAnimal lion = new Lion("Симба", "Лев", 5, "Африканская саванна");
        Animal[] animals = {lion, dog, bird, cat};
        Animal[] animalsPets = {dog, dog1, bird, cat, cat1};
        Owner owner = new Owner();

        // Создание владельцев
        Owner owner1 = new Owner();
        Owner owner2 = new Owner();
        Owner owner3 = new Owner();
        Owner owner4 = new Owner();
        Owner owner5 = new Owner();
        // добавление животных
        owner1.addPet(dog);
        owner2.addPet(bird);
        owner3.addPet(cat);
        owner4.addPet(dog1);
        owner5.addPet(cat1);

       /* for (Animal animalsPet : animalsPets) {
            System.out.println(animalsPet.getAge());
        }*/


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
        System.out.println("Общее количество животных " + owner.getTotalOwners());
    }
}
