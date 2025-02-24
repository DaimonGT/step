package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

import java.util.Random;

public class OwnerFactory {

    //Второй способ генерации рандомного хозяина
    private static String[] names = { "Дима", "Саша", "Настя", "Женя", "Оля", "Люда" };

    private static String[] lastNames = { "Романенко", "Петренко", "Маленко", "Моисенко", "Литвиненко" };

    private static Random num = new Random();

    // Создание рандомного хозяина
    public static Owner next() {
        String randomName = names[num.nextInt(names.length)];
        String randomLastName = lastNames[num.nextInt(lastNames.length)];
        return new Owner(randomLastName, randomName);
    }
}
