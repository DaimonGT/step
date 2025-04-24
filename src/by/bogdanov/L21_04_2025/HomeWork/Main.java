package by.bogdanov.L21_04_2025.HomeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
                new GroceryItem("Капуста", Category.VEGETABLE, 0.9, false),
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
        List<GroceryItem> top3 = groceryItems.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(top3);

        // Печать со скидкой
        groceryItems.stream()
                .forEach(groceryItem -> System.out.printf("%s: %.1f Br\n", groceryItem.getName(), groceryItem.getPrice() * 0.9));

        //Есть ли товар дешевле 1 Br?
        boolean less1Br = groceryItems.stream()
                .anyMatch(groceryItem -> groceryItem.getPrice() < 1.0);
        System.out.println(less1Br);

        //Все ли товары дороже 0
        boolean allMatch = groceryItems.stream()
                .allMatch(groceryItem -> groceryItem.getPrice() > 0);
        System.out.println(allMatch);

        // Первая овощная позиция
        Optional<GroceryItem> any = groceryItems.stream()
                .filter(groceryItems2 -> groceryItems2.getCategory().equals(Category.VEGETABLE))
                .findAny();
        System.out.println(any);

        //Получите List<Category> всех уникальных категорий товаров.
        
    }
}
