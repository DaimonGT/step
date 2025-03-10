package by.bogdanov.L10_03_2025.Transport;

public class Bike extends Transport {
    private boolean hasSidecar;

    public Bike(String model, int speed, String licensePlate, boolean hasSidecar) {
        super(model, speed, licensePlate);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return super.toString() + " Наличие коляски: " + hasSidecar;
    }
}
