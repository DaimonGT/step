package by.bogdanov.L16_04_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task01 {
    public static void main(String[] args) {
        // метод getFirst, который возвращает первый элемент из списка любого типа: В аргументе List
        List<Integer> numbers = List.of(3, 4, 5);
        System.out.println(getFirst(numbers));

        // метод printArray, который печатает элементы массива: В агрументе массив
        String[] str = {"Привет", "Кот", "Собака"};
        printArray(str);

        // Метод считает, сколько раз элемент встречается в списке: В аргументах List и объект
       Integer count = count(numbers, 3);
        System.out.println(count);

        // Метод проверяет, есть ли элемент:  В аргументах массив и объект
        boolean foundElements = foundElement(str, "Кот");
        System.out.println("Наличие эелемента в массиве: " + foundElements);

        //Создание списка из массива
        String [] names = {"Дима", "Женя", "Саша"};
        System.out.println(changeArray(names));

        //Копирование содержимого одного списка в другой(не работает)
        List<String> animals = List.of("Cat", "Dog");
        List<String> animals1 = List.of("Parrot", "Hamster");
        // copyArray(animals, animals1);
    }

    // метод getFirst, который возвращает первый элемент из списка любого типа: В аргументе List
    public static <T> T getFirst(List<T> list) {
        return list.getFirst();
    }

    // метод printArray, который печатает элементы массива: В агрументе массив
    public static <T> void printArray(T [] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }

    // Метод считает, сколько раз элемент встречается в списке: В аргументах List и объект
    public static<T> Integer count (List<T> list, T o){
        int count = 0;
        for (Object object : list) {
            if (object.equals(o)){
                count ++;
            }
        }
        return count;
    }

    // Метод проверяет, есть ли элемент:  В аргументах массив и объект
    public static <T> boolean foundElement(T [] arr1, T o){
        for (T t : arr1) {
            //if(Objects.equals(t, o))
            if(o.equals(t)){
                return true;
            }
        }
        return false;
    }

    //Создание списка из массива
    public static <T> List changeArray(T [] array){
        List<T> list = new ArrayList<>();
        for (T t : array) {
            list.add(t);
        }
        return list;
    }

    //Копирование содержимого одного списка в другой (не работает)
    public static<T> void copyArray(List<T> list1, List<T> list2){
        list2.clear();
        list2.addAll(list1);
        System.out.println(list1);
    }


    public static <T extends Comparable<T>> T min(T el1, T el2){
        return (el1.compareTo(el2) <=0) ?el1 : el2;
    }

/*    public static <T> int getIndexElement(T[] array, T element){

    }*/
}
