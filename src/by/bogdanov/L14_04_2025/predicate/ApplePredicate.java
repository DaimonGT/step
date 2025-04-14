package by.bogdanov.L14_04_2025.predicate;

import by.bogdanov.L14_04_2025.Apple;


@FunctionalInterface
public interface ApplePredicate<T> {
    boolean test(T t);
}
