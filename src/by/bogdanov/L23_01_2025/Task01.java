package by.bogdanov.L23_01_2025;

import java.util.Arrays;
import java.util.Random;

// Создание и вывод объекта
public class Task01 {
    public static void main(String[] args) {
        //createBulding();
        create200Building();
    }

    public static void createBulding() {
        Building building1 = new Building(10, 10, "Кирпич", "Смоленская"); // создание объекта здание 1
        Building building2 = new Building(20, 40, "Дерево", "Фрунзе"); // создание объекта здание 2
        int[] arrayBuilding = new int[200];
        Random random = new Random();
        int randomNum = random.nextInt(20);
        System.out.println(building1.getDescription()); // вызов метода getDescription() и вывод в консоль
        System.out.println(building2.getDescription()); // вызов метода getDescription() и вывод в консоль
    }


    public static void create200Building() {
        Building[] arrayBuilding = new Building[200];
        for (int i = 0; i < arrayBuilding.length; i++) {
            Random random = new Random();
            int randomNum = random.nextInt(20);
            arrayBuilding[i] = new Building(randomNum, randomNum, "Кирпич", "Смоленская");
            System.out.println(arrayBuilding[i].getDescription());
        }
    }
}
