package by.bogdanov.L13_03_2025.Transport3;

public class Bike extends Transport {
    private boolean hasSidecar;

    public Bike(String model, int speed, String licensePlate, boolean hasSidecar, int year, User user) {
        super(model, speed, licensePlate);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return super.toString() + " Наличие коляски: " + hasSidecar;
    }
}
