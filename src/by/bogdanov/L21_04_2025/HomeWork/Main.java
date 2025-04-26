package by.bogdanov.L21_04_2025.HomeWork;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.*;
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

        List<Customer> customers = List.of(
                new Customer("Андрей", List.of(
                        new GroceryItem("Milk", Category.DAIRY, 1.2, true),
                        new GroceryItem("Bread", Category.BAKERY, 0.8, true)
                )),
                new Customer("Ирина", List.of(
                        new GroceryItem("Apple", Category.FRUIT, 0.5, true),
                        new GroceryItem("Wine", Category.BEVERAGE, 5.0, false),
                        new GroceryItem("Cheese", Category.DAIRY, 3.0, true)
                )),
                new Customer("Сергей", List.of(
                        new GroceryItem("Eggs", Category.DAIRY, 2.0, true),
                        new GroceryItem("Chocolate", Category.BAKERY, 1.5, false)
                )),
                new Customer("Дима", List.of()));

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

        // Получить единый поток всех покупок всех клиентов и собрать List<GroceryItem>
        List<GroceryItem> listBuy = customers.stream()
                .flatMap(customer -> customer.getShoppingList().stream())
                .toList();
        System.out.println(listBuy);

        // Через map(Customer::getName) и count() вывести численность клиентов.
        Long customerCount = customers.stream()
                .map(Customer::getName)
                .count();

        System.out.println(customerCount);

        //Найдите клиента, у которого максимальная сумма покупок.
        Optional<Customer> sum = customers.stream()
                .max(Comparator.comparingDouble(c -> c.getShoppingList().stream().mapToDouble(GroceryItem::getPrice).sum()));

        System.out.println(sum);

        //Соберите Set<String> названий всех купленных товаров
        Set<String> groceryBuy = customers.stream()
                .flatMap(customer -> customer.getShoppingList().stream())
                .map(GroceryItem::getName)
                .collect(Collectors.toSet());

        System.out.println(groceryBuy);

        //Map<Category, Set<String>>, где ключ — категория, значение — имена покупателей, купивших товары этой категории.
        //Collectors.groupingBy(Category, Collectors)

        //Optional — покупатель без покупок
        Optional<Customer> first = customers.stream()
                .filter(customer -> customer.getShoppingList().isEmpty())
                .findFirst();
        System.out.println(first);

        //Таблица покупок по категориям
        Map<Category, Set<String>> map = customers.stream()
                .flatMap(customer -> customer.getShoppingList().stream())
                .collect(Collectors.groupingBy(GroceryItem::getCategory,
                        Collectors.flatMapping(item -> customers.stream()
                                .filter(customer -> customer.getShoppingList()
                                        .contains(item))
                                .map(Customer::getName), Collectors.toSet())));

        // Collectors.summarizingDouble для каждого клиента
        // Постройте Map<String, DoubleSummaryStatistics> суммарной статистики цен для каждого покупателя:
/*        Map<Category, Set<String>> map2 = customers.stream().collect(Collectors.toMap(Customer::getName, Collectors.flatMapping(customer -> customer.getShoppingList()
                .stream().collect(Collectors.summarizingDouble(GroceryItem::getPrice)))));*/

        // stringBuilder
        StringBuilder sb = new StringBuilder("abc");
        for (int i = 0; i < 1000; i++) {
            sb.append("1");
        }

        // работа с датой
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int year = now.getYear();
        System.out.println(year);
        Month month = now.getMonth();
        System.out.println(month);
        // вернет месяц
        int i = month.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(i);
        // вернет день
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        //Своя дата
        LocalDate localDate = LocalDate.of(2024, 11, 2);
        String displayName = localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(displayName);
        //Работа со временем
        LocalTime lt = LocalTime.of(13,14,44);
        LocalTime parse = LocalTime.parse("13:34:12");
        LocalDate date = LocalDate.parse("2025-02-22");
        System.out.println(date);

        LocalDateTime ldt = LocalDateTime.of(2017, Month.NOVEMBER, 21,13,12,50);
        System.out.println(ldt);
       // LocalDateTime vst = LocalDateTime.now(ZoneId.of("VST"));

        //периоды
        //длительность времени между промежутками
        Duration between = Duration.between(LocalTime.of(15, 15, 15), LocalTime.of(16, 16, 16));
        long minutes = between.toMinutes();
        System.out.println(minutes);

        //возвращает новую дату
        LocalDate date1 = date.withYear(2000);
        System.out.println(date1);

        //Форматы
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse1 = LocalDate.parse("10/02/2009", dateTimeFormatter);
        System.out.println(parse1);
    }
}
