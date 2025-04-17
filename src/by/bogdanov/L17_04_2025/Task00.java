package by.bogdanov.L17_04_2025;

import by.bogdanov.L14_04_2025.Apple;
import by.bogdanov.L14_04_2025.Color;
import by.bogdanov.L14_04_2025.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

import static java.lang.Integer.compare;

public class Task00 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("Юля");
        list.add("Сергей");
        list.add("Петя");

        forEach(list, c -> System.out.println(c));
        forEach(list, c -> list2.add(c + " Олегович"));
        //forEach(list2, c -> System.out.println(c));\
        System.out.println(list2);
/*        list.forEach(c -> list2.add(c + " Олегович"));
        System.out.println(list2);*/
        list.forEach(c -> System.out.println(c)); // consumer

        // function превращяет в другой тип
        List<Integer> mapList = map(list, c -> c.length());
        System.out.println(mapList);

        List<Apple> apples = List.of(
                new Apple(100, Color.GREEN),
                new Apple(150, Color.RED),
                new Apple(200, Color.YELLOW));

        List<Color> mapListColor = map(apples, c -> c.getColor());
        System.out.println(mapListColor);
        IntPredicate booleanIntFunction = (int i) -> i % 2 == 0; // если не нужна автоупаковка, лучше использовать IntPredicate(лучше для памяти)
        Random r = new Random();
        Supplier<Integer> supplier = () -> r.nextInt(100); // () - пустые скобки озночает, что ничего не возвращает
        System.out.println(supplier.get());

        //использование локальных переменных для лямды
        final int a = 10;
        Runnable runnable = () -> System.out.println(a);

        //ссылки на методы
        List<Color> map1 = map(apples, Apple::getColor);
        List<Integer> weight = map(apples, Apple::getWeight);
        list.forEach(System.out::println);

        //ссылки на контруктор
        Supplier<Apple> a1 = Apple::new;
        Apple apple = a1.get();
        //ссылка на контруктор с параметрами
        BiFunction<Integer, Color, Apple> a2 = Apple::new; // сперва типы в конструкторе, затем сам тип
        Apple apple1 = a2.apply(200, Color.GREEN);

        apples.sort(( a3,  a4)-> a3.getWeight().compareTo(a4.getWeight()));
        Comparator<Apple> comparing = Comparator.comparing((Apple a5) -> a5.getWeight());
        apples.sort(comparing);
        //любая сортировка пишется так выше 7 джава
        apples.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getColor)); // .thenComparing(Apple::getColor)) можно далее сортировать, например обратная сортировка и далее по цвету
        Predicate<Apple> predicate = (Apple a5) -> a5.getWeight() == 100;
        Predicate<Apple> equalsColorGreen = predicate.and(a5 -> Color.GREEN.equals(a5.getColor()));


    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }

    //function
    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>(); // возвращает другого типа R
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }
}
