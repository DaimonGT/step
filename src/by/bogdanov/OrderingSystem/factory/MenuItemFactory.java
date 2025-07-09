package by.bogdanov.OrderingSystem.factory;

import by.bogdanov.OrderingSystem.model.MenuItem;

public interface MenuItemFactory {
    MenuItem createMenuItem(int idDishes, String name, double price, boolean available);
}
