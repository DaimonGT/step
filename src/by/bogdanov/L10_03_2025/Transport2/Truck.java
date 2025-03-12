package by.bogdanov.L10_03_2025.Transport2;

public class Truck extends Transport {
    private int loadCapacity;

    public Truck(String model, int speed, String licensePlate, int loadCapacity) {
        super(model, speed, licensePlate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " грузоподъемность: " + loadCapacity;
    }

}
