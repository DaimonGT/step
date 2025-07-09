package by.bogdanov.OrderingSystem.factory;

import by.bogdanov.OrderingSystem.model.Category;
import by.bogdanov.OrderingSystem.model.MenuItem;

public class DrinkFactory implements MenuItemFactory {

    @Override
    public MenuItem createMenuItem(int idDishes, String name, double price, boolean available) {
        return new MenuItem(name, price, Category.DRINK, available);
    }
}
