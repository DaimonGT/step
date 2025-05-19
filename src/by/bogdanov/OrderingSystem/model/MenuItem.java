package by.bogdanov.OrderingSystem.model;

public class MenuItem {
    private int idDishes;
    private String name;
    private double price;
    private Category categoryDishes;
    private boolean availability;
    private static int totalDishes = 0;

    public MenuItem(String name, double price, Category categoryDishes, boolean availability) {
        this.idDishes = ++totalDishes;
        this.name = name;
        this.price = price;
        this.categoryDishes = categoryDishes;
        this.availability = availability;
    }

    public int getIdDishes() {
        return idDishes;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategoryDishes() {
        return categoryDishes;
    }

    public boolean isAvailability() {
        return availability;
    }
}
