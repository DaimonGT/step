package by.bogdanov.L21_04_2025.HomeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<GroceryItem> groceryItems = Arrays.asList(
                new GroceryItem("Свинина", Category.MEAT, 15.4, true),
                new GroceryItem("Говядина", Category.MEAT, 20.4, true),
                new GroceryItem("Яблоко", Category.FRUIT, 2.4, false),
                new GroceryItem("Груша", Category.FRUIT, 3.2, false),
                new GroceryItem("Огурцы", Category.VEGETABLE, 4.2, false),
                new GroceryItem("Капуста", Category.VEGETABLE, 3, false),
                new GroceryItem("Сок", Category.BEVERAGE, 4.97, false),
                new GroceryItem("Молоко", Category.DAIRY, 4.97, false)
        );
        //Используя filter, получите список всех товаров с Category.DAIRY
        List<GroceryItem> listDairy = groceryItems.stream()
                .filter(groceryItems1 -> groceryItems1.getCategory().equals(Category.DAIRY))
                .collect(Collectors.toList());
        System.out.println(listDairy);

        // С помощью filter и map, получите List<String> имён всех скоропортящихся товаров (isPerishable() == true).
        List<String> listIsPerishable = groceryItems.stream().filter(GroceryItem::isPerishable)
                .map(GroceryItem::getName)
                .toList();
        System.out.println(listIsPerishable);

        // сортировка по цене
        List<String> collect = groceryItems.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice))
                .map(GroceryItem::getName)
                .collect(Collectors.toList());
        System.out.println(collect);

        // Топ‑3 самых дорогих
        groceryItems.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}
