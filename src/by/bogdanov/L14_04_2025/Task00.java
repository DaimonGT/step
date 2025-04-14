package by.bogdanov.L14_04_2025;

import by.bogdanov.L14_04_2025.impl.AppleGreenColorPredicate;
import by.bogdanov.L14_04_2025.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class Task00 {
    public static void main(String[] args) {
        List<Apple> apples = List.of(
                new Apple(100, Color.GREEN),
                new Apple(150, Color.RED),
                new Apple(200, Color.GREEN),
                new Apple(250, Color.YELLOW)
        );
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Apple> greenApples = filterColorApples(apples, Color.GREEN);
        List<Apple> heavyApples = filterHeavyApples(apples, 150);
        List<Apple> apples1 = filterApple(apples, Color.YELLOW, 150, true);
        List<Apple> apples2 = filterApplePredicate(apples, new AppleGreenColorPredicate());
        System.out.println(greenApples);
        System.out.println(heavyApples);
        System.out.println(apples1);
        System.out.println(apples2);

/*        filterApplePredicate(apples, new ApplePredicate() { // new ApplePredicate - анонимный метод
            @Override
            public boolean test(Apple apple) {
                return Color.RED.equals(apple.getColor());
            }
        });*/
        filterApplePredicate(apples, (Apple a) -> Color.YELLOW.equals(a.getColor())); // лямда выражение
        System.out.println(filterApplePredicate(numbers, (Integer n) -> n % 2 == 0));
    }

    private static List<Apple> filterColorApples(List<Apple> apples, Color color) {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (color.equals(apple.getColor())) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    private static List<Apple> filterHeavyApples(List<Apple> apples, int weight) {
        List<Apple> heavyApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > weight) {
                heavyApples.add(apple);
            }
        }
        return heavyApples;
    }

    private static List<Apple> filterApple(List<Apple> apples, Color color, int weight, boolean bool) {
        List<Apple> apples1 = new ArrayList<>();
        if (bool) {
            for (Apple apple : apples) {
                if (color.equals(apple.getColor())) {
                    apples1.add(apple);
                }
            }
        } else {
            for (Apple apple : apples) {
                if (apple.getWeight() > weight) {
                    apples1.add(apple);
                }
            }
        }
        return apples1;
    }


    public static <T> List<T> filterApplePredicate(List<T> harvest, ApplePredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : harvest) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
