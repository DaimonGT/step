package by.bogdanov.L21_04_2025;

import by.bogdanov.L14_04_2025.Apple;

import java.util.*;
import java.util.stream.Collectors;

public class Task00 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH));
        List<String> collect = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories)) // сравненние ссылкой на метод
                .map(Dish::getName)
                .limit(3)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

        menu.stream()
                .filter(dish -> dish.getCalories() > 300) // сортировка
                .sorted(Comparator.comparing(Dish::getCalories)) // сравненние ссылкой на метод
                .map(Dish::getName)
                .distinct()
                .forEach(System.out::println);

        // кол-во букв в имени
        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        boolean isVegetarinn = menu.stream()
                .anyMatch(Dish::isVegetarian);// есть ли такая
        boolean allMatch = menu.stream()
                .allMatch(dish -> dish.getCalories() > 1000); // все ли больше 1000
        boolean noneMatch = menu.stream().noneMatch(dish1 -> dish1.getCalories() >= 1000);

        Optional<Dish> any = menu.stream()
                .filter(Dish::isVegetarian)
                .findAny(); // найдет любое вегетарианское блюдо

        if (any.isPresent()) { // существует или нет
            Dish dish = any.get();
        }

        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(dish -> System.out.println(dish.getName())); //напечатает, если нашел

        // Вернет первое вегетарианское блюдо
        Optional<Dish> first = menu.stream()
                .filter(Dish::isVegetarian)
                .findFirst();

        //Общее кол-во калорий
        int sum = menu.stream()
                .mapToInt(Dish::getCalories) //mapToInt инт знач для матем.формул
                .sum();
        int i = menu.stream().mapToInt(Dish::getCalories).max().orElse(1);


        //как сделать мапу
        Map<Type, List<Dish>> collect1 = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect1);

//System.out.println(lowCalories(menu));
    }

    public static List<String> lowCalories(List<Dish> menu) {
        List<Dish> lessCalories = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                lessCalories.add(dish);
            }
        }
        Comparator<Dish> comparing = Comparator.comparing(Dish::getCalories);
        lessCalories.sort(comparing);
        List<String> names = new ArrayList<>();
        for (Dish lessCalories1 : lessCalories) {
            names.add(lessCalories1.getName());
        }
        return names;
    }

}
