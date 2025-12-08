package by.bogdanov.L13_10_2025;

import java.util.*;
import java.util.stream.Collectors;

public class SimpleStoreTasks {

    // Задача 1: Найти все товары дороже заданной цены
    public static List<Product> findExpensiveProducts(Store store, double minPrice) {
        return store.getProducts().stream()
                .filter(product -> product.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

    //Задача 2: Подсчитать количество товаров в магазине
    public static int countProducts(Store store){
        return store.getProducts().stream().mapToInt(Product::getStock).sum();
    }

    // Задача 3: Найти корзины, содержащие более одного экземпляра товара
    public static List<Cart> findCartsWithMultipleQuantities(Store store){
        return store.getCarts().stream()
                .filter(cart -> cart.getItems().stream().anyMatch(cartItem -> cartItem.getQuantity()>1))
                .toList();
    }

    // Задача 4: Найти все категории товаров в корзинах
    public static Set<Category> findCategoriesInCarts(Store store){
        return store.getCarts().stream()
                .flatMap(cart -> cart.getItems().stream()).map(p ->p.getProduct().getCategory()).collect(Collectors.toSet());
    }
    // Задача 5: Подсчитать общее количество товаров в корзине по ID
    public static int countItemsInCart(Store store, String cartId){
        return store.getCarts().stream()
                .filter(cart -> cart.getCartId().equals(cartId))
                .flatMap(cart -> cart.getItems().stream()).mapToInt(CartItem::getQuantity).sum();
    }

    // Задача 6: Найти товары с запасом больше заданного значения
    public static List<Product> findHighStockProducts(Store store, int minStock){
        return store.getProducts().stream()
                .filter(product -> product.getStock() > minStock).toList();
    }

    // Задача 7: Проверить, есть ли товар в корзинах
    public static boolean isProductInCarts(Store store, String productId){
        return store.getCarts().stream()
                .flatMap(cart -> cart.getItems().stream())
                .anyMatch(i->i.getProduct().getProductId().equals(productId));
    }

    // Задача 8: Найти корзины с товарами заданной категори
    public static List<Cart> findCartsByCategory(Store store, Category category){
       return store.getCarts().stream()
                .filter(cart -> cart.getItems().stream().anyMatch(i->i.getProduct().getCategory().equals(category))).toList();
    }
    // Задача 11: Найти общую стоимость всех товаров на складе (price * stock для всех товаров)
    public static double calculateTotalInventoryValue(Store store) {
        return store.getProducts().stream().mapToDouble(p -> p.getPrice() * p.getStock()).sum();
    }
    // Задача 12: Найти корзины с общей стоимостью выше заданного порога
    public static List<Cart> findExpensiveCarts(Store store, double threshold) {
       return store.getCarts().stream().filter(cart -> cart.getTotalPrice() > threshold).toList();
    }
    // Задача 13: Подсчитать количество товаров каждой категории в магазине
/*    public static Map<Category, Integer> countProductsByCategory(Store store) {
        return store.getProducts().stream()
                .collect(Collectors.groupingBy(product -> product.getCategory(), Collectors.counting())).
                entrySet().stream().
                collect(Collectors.toMap(Product::getCategory, Product::getStock);
    }*/

}
