package by.bogdanov.OrderingSystem.builder;

import by.bogdanov.OrderingSystem.model.Customer;
import by.bogdanov.OrderingSystem.model.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private int id;
    private Customer customer;
    private List<MenuItem> items = new ArrayList<>();

    public OrderBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public OrderBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder addItem(MenuItem item) {
        this.items.add(item);
        return this;
    }

    public OrderBuilder addItems(List<MenuItem> items) {
        this.items.addAll(items);
        return this;
    }
}
