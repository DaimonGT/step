package by.bogdanov.L06_03_2025.Transport;

public class Truck extends Transport {
    private int loadCapacity;

    public Truck(String model, int speed, int loadCapacity) {
        super(model, speed);
        this.loadCapacity = loadCapacity;
    }
}
