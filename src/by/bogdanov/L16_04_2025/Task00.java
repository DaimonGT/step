package by.bogdanov.L16_04_2025;

import java.util.List;
import java.util.function.Predicate;

public class Task00 {
    public static void main(String[] args) {
        //Проверить, есть ли строки, начинающиеся с "A"
        List<String> strings = List.of("Apple", "Sun", "Main");
        String str = "A";
        boolean anyContainsChar = anyMatch(strings, s -> s.contains(str));
        System.out.println("Есть строки, которые содержат букву: " + str + " - " + anyContainsChar);

        //Проверить, все числа больше 0? Все люди старше 18?
        List<Integer> numbers = List.of(20, 21, 19);
        Integer num = 18;
        boolean allMoreNum = allMatch(numbers, n -> n > num);
        System.out.println("Все числа в листе больше: " + num + " - " + allMoreNum);

        //Найти строки, которые содержат слово "java"
        List<String> strWords = List.of("java Academy", "Apple jus", "Rush");
        String word = "java";
        String firstMatch = findFirstMatch(strWords, s -> s.contains(word));
        if(firstMatch.contains(word)){
            System.out.println("В строке " + firstMatch + " есть слово: " + word);
        } else {
            System.out.println("Нет строки со словом " + word);
        }
    }

    //Проверить, есть ли строки, начинающиеся с "A"
    public static <T> boolean anyMatch(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (predicate.test(t)) {
                return true;
            }
        }
        return false;
    }

    //Проверить, все числа больше 0? Все люди старше 18?
    public static <T> boolean allMatch(List<T> list, Predicate<T> predicate) {
        for (T i : list) {
            if (!predicate.test(i)) {
                return false;
            }
        }
        return true;
    }

    //Найти строки, которые содержат слово "java"
    private static String findFirstMatch(List<String> list, Predicate<String> predicate) {
        for (String t : list) {
            if (predicate.test(t)) {
                return t;
            }
        }
        return null;
    }
}
