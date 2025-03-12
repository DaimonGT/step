package by.bogdanov.L10_03_2025.Transport2;

public class Car extends Transport {
    private final String fuelType;

    public Car(String model, int speed, String licensePlate, String fuelType) {
        super(model, speed, licensePlate);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " Тип топлива: " + fuelType;
    }
}
