package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

import java.util.Random;

public class PetFactory {
    private String[] petName = {"Мурка", "Барсик", "Шарик", "Тузик", "Чарли", "Кеша", "Карлуша", "Марта"};
    private String[] petSpecies = {"Собака", "Кот", "Птичка"};
    Random num = new Random();

    // Рандомная генерация питомца
    Pet next() {
        String randomPetName = petName[num.nextInt(petName.length)];
        String randomPetSpecies = petSpecies[num.nextInt(petSpecies.length)];
        int randomPetAge = num.nextInt(15);
        return new Pet(randomPetName, randomPetSpecies, randomPetAge);
    }
}

