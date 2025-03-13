package by.bogdanov.L13_03_2025.Transport3;

import by.bogdanov.L23_01_2025.Product;

import java.util.Objects;

public abstract class Transport implements Comparable<Transport> {
    private final String model;
    private final int speed;
    private final String licensePlate;
    private User user;
    private int year;


    public Transport(String model, int speed, String licensePlate) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
    }

    public Transport(String model, int speed, String licensePlate, int year) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
        this.year = year;
    }

    public Transport(String model, int speed, String licensePlate, User user, int year) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
        this.user = user;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public User getUser() {
        return user;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(licensePlate, transport.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licensePlate);
    }

    @Override
    public String toString() {
        return "Модель: " + model + " максимальная скорость: " + speed + " Год выпуска:" + year;
    }

    @Override
    public int compareTo(Transport o) {
        int nameCompare = this.model.compareTo(o.model);
        if(nameCompare !=0) {
            return nameCompare;
        }
        return Integer.compare(this.speed, o.speed);
    }
}
