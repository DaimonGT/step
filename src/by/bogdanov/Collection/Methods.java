package by.bogdanov.Collection;

import java.util.*;
import java.util.stream.Stream;

public class Methods {

    // 1. Удаление дубликатов, сохранив порядок элементов
    public void printUniqueNames(List<String> name) {
        Set<String> uniqueNames = new HashSet<>();
        for (Object names : name) {
            uniqueNames.add(names.toString());
        }
        System.out.println(uniqueNames);
    }

    // 2. Выбор только уникальных чисел
    public void printUniqueNumbers(List<Integer> num) {
        Set<Integer> numbers = new HashSet<>(num);
        System.out.println(numbers);
    }

    // 3. Есть ли дубликаты в List
    public boolean hasDuplicates(List<String> list) {
        Set<String> uniqueValue = new HashSet<>();
        for (String values : list) {
            if (!uniqueValue.add(values)) {
                System.out.println("Есть дубликаты");
                return true;
            }
        }
        System.out.println("Нет дубликатов");
        return false;
    }

    // 4. Найти все общие элементы
    public void printUniqueNames(Set<String> list1, Set<String> list2) {
        Set<String> uniqueNames = new HashSet<>(list1);
        uniqueNames.retainAll(list2);
        System.out.println(uniqueNames);
    }

    // 5. Найти уникальные элементы первого множества, которых нет во втором
    public void printUniqueElements(Set<String> list1, Set<String> list2) {
        Set<String> uniqueElements = new HashSet<>(list1);
        uniqueElements.removeAll(list2);
        System.out.println(uniqueElements);
    }

    // 6. Найти количество уникальных слов в тексте
    public void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    // 7. Сортировка List по длине строк
    public void sortByLengthOfLines(List<String> list) {
        Collections.sort(list, new StringLengthComparator());
        System.out.println(list);
    }

    //8. Найти первое слово, которое встречается только один раз
    public void firstUniqueWord(List<String> words) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        // Находим первое слово с одним вхождением
        for (String word : words) {
            if (wordCount.get(word) == 1) {
                System.out.println(word);
                break;
            }
        }
    }

    // 9. Разделить List<Integer> на четные и нечетные числа
    public void evenAndOddNumbers(List<Integer> numbers){
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if(number % 2 == 0){
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        System.out.println("Чётные числа: " + evenNumbers);
        System.out.println("Нечётные числа: " + oddNumbers);
    }
}


