package by.bogdanov.L24_03_2025;

import java.util.EnumMap;
import java.util.EnumSet;

public class Task00 {
    public static void main(String[] args) {
        DayOfWeek friday = DayOfWeek.FRIDAY;
        String russianName = friday.getRussianName();
        System.out.println(russianName);
        //возвращает все, что есть в массиве
        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.println(value.getRussianName());
        }
        // получить значение по имени (Вернет Enum весь)
        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");
        System.out.println(monday);
        EnumSet<DayOfWeek> dayOfWeeks = EnumSet.of(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY); // создание коллекции с Enum
        EnumMap<DayOfWeek, Integer> day = new EnumMap<>(DayOfWeek.class); // создание пустой мапы
        //test(friday);
    }

    private static void test(DayOfWeek dayOfWeek){
        if(DayOfWeek.FRIDAY == dayOfWeek) {
            System.out.println("Ура пятница");
        }
    }
}
