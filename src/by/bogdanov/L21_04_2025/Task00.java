package by.bogdanov.L21_04_2025;

import by.bogdanov.L14_04_2025.Apple;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<Dish> menu2 = Arrays.asList(new Dish("pork2", false, 800, Type.MEAT),
                new Dish("beef2", false, 500, Type.MEAT),
                new Dish("chicken2", false, 600, Type.MEAT),
                new Dish("french fries2", true, 300, Type.OTHER),
                new Dish("rice2", true, 550, Type.OTHER),
                new Dish("season fruit2", true, 130, Type.OTHER),
                new Dish("pizza2", true, 570, Type.OTHER),
                new Dish("prawns2", false, 350, Type.FISH),
                new Dish("salmon2", false, 470, Type.FISH));

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

        System.out.println("Новый урок 24.04.2025");
        List<List<Dish>> listList = List.of(menu, menu2);
        //Схлопывание
        List<Dish> collect2 = listList.stream()
                .map(Collection::stream)
                .flatMap(Stream::distinct)
                .collect(Collectors.toList());

        List<Dish> collect3 = listList.stream()
                .flatMap(l -> l.stream())
                .toList(); // если toList - то коллекция не изменяемая
        // как создать поток из массива
        int[] nums = {1, 2, 3, 4, 5};
        int sum1 = Arrays.stream(nums).sum();

        //создание стрима
        Stream.of("home", "java", "dish", "javascript")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // пустой поток данных
        Dish nullDish = null;
        Stream.empty();
        // проверка на null
        Stream.ofNullable(nullDish)
                .map(Dish::getCalories)
                .forEach(System.out::println);

        //Создание бесконечных потоков
        Stream.iterate(0, n -> n + 2).limit(10)
                .forEach(System.out::println);
        Stream.iterate(0, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);

        // генерирует (требуется что то создать(суплаер))
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        // объеденить что либо, например, название блюд в строку
        String stringDishNames = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.joining(", "));
        System.out.println(stringDishNames);

        //подсчитает сколько блюд (кол-во)
        Long collect4 = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.counting());

        Optional<Dish> collect5 = menu.stream().collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)));

        // суммирует, например, общее кол-во калорий
        Integer collect6 = menu.stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        // среднее, например, среднее кол-во калорий
        Double collect7 = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));

        // получение статисткики у объекта, например, мин, макс
        IntSummaryStatistics statistics = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println(statistics.getMax());

        //работа с примитвными типами

        int sum2 = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        //групировка
        Map<String, List<Dish>> collect8 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getName));

        // большая лямбда с телом, но указывать return в зависимости от лябды
        Map<String, List<Dish>> collect9 = menu.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return "DIET";
            } else if (dish.getCalories() <= 700) {
                return "NORMAL";
            } else {
                return "FAT";
            }
        }));

        Map<Type, List<Dish>> typeToListDishMoreThen500 = menu.stream()
                .filter(dish -> dish.getCalories() > 500)
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(typeToListDishMoreThen500);

        Map<Type, List<Dish>> collect10 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors
                        .filtering(dish -> dish.getCalories() > 500, Collectors.toList())));

        System.out.println(collect10);

        //руппировка по типу с подсчетом
        Map<Type, Long> collect11 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
        System.out.println(collect11);

        Map<Type, Optional<Dish>> mapOpt = menu.stream().
                collect(Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));

        // группировка по типу с максимальными калориями
        Map<Type,Dish> mapDish = menu.stream().
                collect(Collectors.groupingBy(Dish::getType, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)),Optional::get)));
        System.out.println(mapDish);

        // проверка на null
        Optional<Integer> i1 = Optional.ofNullable(nullDish).map(Dish::getCalories);
        System.out.println(i1);

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
