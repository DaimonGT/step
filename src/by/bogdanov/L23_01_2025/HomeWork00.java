package by.bogdanov.L23_01_2025;

import java.util.Arrays;
import java.util.Random;

public class HomeWork00 {
    public static void main(String[] args) {
        //homeWorks00();
        //homeWorks01();
        //homeWorks02();
        homeWorks03();
    }

   /* 1.Создайте 200 объектов класса Building с одинаковыми улицей и материалом, но с рандомным количеством окон и
   дверей от 0 - 20.*/

    public static void homeWorks00() {
        BuildingsHomeWork[] arrayWithBuilding = new BuildingsHomeWork[200];
        for (int i = 0; i < arrayWithBuilding.length; i++) {
            Random num = new Random();
            int randomNum = num.nextInt(20);
            arrayWithBuilding[i] = new BuildingsHomeWork(randomNum, randomNum, "Фрунзе", "Фанеры");
            System.out.println(arrayWithBuilding[i].getDescription());
        }
    }


    /*2.Найти в предыдущем массиве Building который содержит 10 окон и заменить у этих домов материал на другой
    (любой).
    После изменения материала снова выводится описание всех зданий.*/

    public static void homeWorks01() {
        BuildingsHomeWork[] arrayWithBuilding = new BuildingsHomeWork[200];
        for (int i = 0; i < arrayWithBuilding.length; i++) {
            Random num = new Random();
            int randomNum = num.nextInt(20);
            arrayWithBuilding[i] = new BuildingsHomeWork(randomNum, randomNum, "Фрунзе", "Фанеры");
            System.out.println(arrayWithBuilding[i].getDescription());
        }
        System.out.println();
        System.out.println("Изменение массива");
        for (int i = 0; i < arrayWithBuilding.length; i++) {
            if (arrayWithBuilding[i].windows == 10) {
                arrayWithBuilding[i].materials = "Алюминия";
            }
            System.out.println(arrayWithBuilding[i].getDescription());
        }
    }


    /*4.Создайте 200 объектов класса Building:
    Высота здания должна быть случайным числом от 1 до 50 метров.
    Год постройки должен быть случайным числом в диапазоне от 1900 до 2023 года.
    Выведите описание каждого здания:
    Каждое описание должно теперь включать высоту здания и  год постройки*/

    public static void homeWorks02() {
        BuildingsHomeWork[] arrayWithBuilding = new BuildingsHomeWork[200];
        for (int i = 0; i < arrayWithBuilding.length; i++) {
            Random num = new Random();
            int randomNumYear = num.nextInt(1900, 2024);
            int randomHeight = num.nextInt(1, 51);
            arrayWithBuilding[i] = new BuildingsHomeWork(20, 10, "Фрунзе", "Фанеры", randomHeight, randomNumYear);
            System.out.println(arrayWithBuilding[i].getDescription());
        }
        System.out.println();

        /*5.Найдите самое высокое здание и выведите его в консоль (если их несколько то выведите любое)*/
        boolean sortMain = false;
        while (sortMain == false) {
            sortMain = true;
            for (int i = 1; i < arrayWithBuilding.length; i++) {
                if (arrayWithBuilding[i].height < arrayWithBuilding[i - 1].height) {
                    int sort = arrayWithBuilding[i - 1].height;
                    arrayWithBuilding[i - 1].height = arrayWithBuilding[i].height;
                    arrayWithBuilding[i].height = sort;
                    sortMain = false;
                }
            }
        }
        System.out.println("Самое высокое здание - " + arrayWithBuilding[arrayWithBuilding.length - 1].getDescription());
        System.out.println();

        /* 6.Найдите самое старое здание и выведите его в консоль (если их несколько то выведите любое)*/

        while (sortMain == true) {
            sortMain = false;
            for (int i = 1; i < arrayWithBuilding.length; i++) {
                if (arrayWithBuilding[i].yearBuilt < arrayWithBuilding[i - 1].yearBuilt) {
                    int sort = arrayWithBuilding[i - 1].yearBuilt;
                    arrayWithBuilding[i - 1].yearBuilt = arrayWithBuilding[i].yearBuilt;
                    arrayWithBuilding[i].yearBuilt = sort;
                    sortMain = true;
                }
            }
        }
        System.out.println("Самое старое здание - " + arrayWithBuilding[0].getDescription());
    }

    /*Класс "Здание" с рандомными улицами и материалами
    Создайте массивы:
    Массив с различными улицами.
    Массив с различными материалами.
    Создайте 200 объектов класса Building:
    Все поля (число окон, дверей, высота, год постройки, улица и материал) должны быть случайными. Улицы и материалы выбирайте из
    ранее созданных массивов.*/

    public static void homeWorks03() {
        BuildingsHomeWork[] arrayWithBuilding = new BuildingsHomeWork[200];
        String[] arrayStreet = {"Фрунзе", "Лазо", "Смоленская", "Московская", "Билево"};
        String[] arrayMaterial = {"Дерево", "Железа", "Кирпича", "Фанеры", "Бетона"};
        Random num = new Random();
        int sortNum = 0;
        boolean sort = false;

        // Заполнение массива со всеми данными

        for (int i = 0; i < arrayWithBuilding.length; i++) {
            int randomArrayStreet = num.nextInt(arrayStreet.length);
            int randomArrayMaterial = num.nextInt(arrayMaterial.length);
            int randomWindow = num.nextInt(50);
            int randomDoors = num.nextInt(100);
            int randomHeight = num.nextInt(1, 100);
            int randomYears = num.nextInt(1800, 2025);
            arrayWithBuilding[i] = new BuildingsHomeWork(randomWindow, randomDoors, arrayStreet[randomArrayStreet], arrayMaterial[randomArrayMaterial], randomHeight, randomYears);
            System.out.println(arrayWithBuilding[i].getDescription());
        }

        // Сортировка массива arrayWithBuilding по возростанию в переменной int yearBuilt

        while (sort == false) {
            sort = true;
            for (int i = 1; i < arrayWithBuilding.length; i++) {
                if (arrayWithBuilding[i].yearBuilt < arrayWithBuilding[i - 1].yearBuilt) {
                    sortNum = arrayWithBuilding[i - 1].yearBuilt;
                    arrayWithBuilding[i].yearBuilt = arrayWithBuilding[i - 1].yearBuilt;
                    arrayWithBuilding[i - 1].yearBuilt = sortNum;
                    sort = false;
                }
            }
        }

        // Поиск самого нового здания из бетона с высотой > 40

        for (int i = arrayWithBuilding.length - 1; i >= 0; i--) {
            if(arrayWithBuilding[i].materials.equals("Бетона") && arrayWithBuilding[i].height > 40) {
                System.out.println();
                System.out.println("Cамое новое здание из бетона высота которого превышает 40 метров:");
                System.out.println(arrayWithBuilding[i].getDescription());
                break;
            }
        }
    }
}

