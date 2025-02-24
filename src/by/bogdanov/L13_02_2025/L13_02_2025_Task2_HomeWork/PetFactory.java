package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

import java.util.Random;

public class PetFactory {

    private static String[] petName = { "Мурка", "Барсик", "Шарик", "Тузик", "Чарли", "Кеша", "Карлуша", "Марта" };

    private static Random random = new Random();

    // Рандомная генерация питомца
    public static Pet next() {
        String randomPetName = petName[random.nextInt(petName.length)];
        int randomPetAge = random.nextInt(15);
        int i = random.nextInt(3);
        if (i == 2) {
            return new Cat(randomPetName, randomPetAge);
        } else if (i == 1) {
            return new Dog(randomPetName, randomPetAge);
        } else {
            return new Bird(randomPetName, randomPetAge);
        }
    }

}

