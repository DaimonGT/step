package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

public class OwnerFactory {

    Owner next() {
        return new Owner();
    }

    // Второй способ генерации рандомного хозяина
/*    private String [] names = {"Дима", "Саша", "Настя", "Женя", "Оля", "Люда"};
    private String[] lastNames = {"Романенко", "Петренко", "Маленко", "Моисенко", "Литвиненко"};
    Random num = new Random();

    // Создание рандомного хозяина
    Owner next() {
        String randomName = names[num.nextInt(names.length)];
        String randomLastName = lastNames[num.nextInt(lastNames.length)];
        return new Owner(randomLastName,randomName);
    }*/
}
