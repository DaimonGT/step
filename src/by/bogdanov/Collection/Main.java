package by.bogdanov.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Алексей", "Мария", "Алексей", "Дмитрий", "Мария"));
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        Set<String> set1 = Set.of("Алексей", "Мария", "Дмитрий");
        Set<String> set2 = Set.of("Мария", "Сергей", "Алексей");
        Set<String> set3 = Set.of("Алексей", "Мария", "Дмитрий");
        Set<String> set4 = Set.of("Мария", "Сергей");
        List<String> words = List.of("кот", "собака", "кот", "птица", "рыба", "рыба");
        List<String> words1 = new ArrayList<>(List.of("яблоко", "ананас", "киви", "банан"));
        List<String> words2 = List.of("кот", "собака", "кот", "птица", "рыба", "рыба");
        Methods methods = new Methods();

        methods.printUniqueNames(names);
        methods.printUniqueNumbers(numbers);
        methods.hasDuplicates(names);
        methods.printUniqueNames(set1, set2);
        methods.printUniqueElements(set3,set4);
        methods.printUniqueWords(words);
        methods.sortByLengthOfLines(words1);
        methods.firstUniqueWord(words2);
        methods.evenAndOddNumbers(numbers);
    }
}
