package by.bogdanov.L10_02_2025;

public class Task00 {
    public static void main(String[] args) {
        Pet dog = new Dog("Барсик", "Собака", 3, "Дима");
        Pet bird = new Bird("Кеша", "Птица", 1, "Саша");
        Pet cat = new Cat("Мурка", "Кот", 2, "Анна");
        WildAnimal lion = new Lion("Симба","Лев", 5, "Африканская саванна");
        // WildAnimal [] animal = {lion};
        Pet[] animalPet = {dog, bird, cat};

        Animal[] animals = {lion, dog, bird, cat};

/*        for (WildAnimal animal1 : animal) {
            System.out.println(animal1);
            animal1.makeSound();
            animal1.move();
            animal1.eat();
            animal1.play();
        }
        System.out.println();
        for (Pet pet : animalPet) {
            System.out.println();
            System.out.println(pet);
            pet.makeSound();
            pet.move();
            pet.eat();
            pet.play();
        }*/
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
            animal.move();
            animal.eat();
            if (animal instanceof WildAnimal wildAnimal){
                wildAnimal.hunt();
            } else if (animal instanceof Pet pet) {
                pet.play();
            }
            System.out.println();
        }
    }
    }
