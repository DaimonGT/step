package by.bogdanov.OrderingSystem.model;

public class Customer {
    private int idCustomer;
    private final String name;
    private String phone;
    private static int totalCustomer = 0;

    public Customer(String name, String phone) {
        this.idCustomer = ++totalCustomer;
        this.name = name;
        this.phone = phone;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
