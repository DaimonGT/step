package by.bogdanov.L13_03_2025.Transport3;

public class Truck extends Transport {
    private int loadCapacity;

    public Truck(String model, int speed, String licensePlate, int loadCapacity, int year, User user) {
        super(model, speed, licensePlate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " грузоподъемность: " + loadCapacity;
    }

}
