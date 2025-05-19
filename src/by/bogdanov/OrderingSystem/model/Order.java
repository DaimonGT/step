package by.bogdanov.OrderingSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int idOrder;
    private Customer customer;
    private List<MenuItem> menuItemList = new ArrayList<>();
    private Status statusOrder;
    private double sumPrices;
    private static int totalOrders = 0;

    // в конструктор не передал значение sumPrices
    public Order(Customer customer, List<MenuItem> menuItemList, Status statusOrder) {
        this.idOrder = ++totalOrders;
        this.customer = customer;
        this.menuItemList = menuItemList;
        this.statusOrder = statusOrder;
        // Подсчет суммы суммы заказа, куда убрать?
        this.sumPrices = menuItemList.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public int getIdOrder() {
        return idOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public Status getStatusOrder() {
        return statusOrder;
    }

    public double getSumPrices() {
        return sumPrices;
    }
}
