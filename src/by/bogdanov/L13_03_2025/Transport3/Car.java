package by.bogdanov.L13_03_2025.Transport3;

public class Car extends Transport {
    private final String fuelType;

    public Car(String model, int speed, String licensePlate, String fuelType, int year, User user) {
        super(model, speed, licensePlate);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " Тип топлива: " + fuelType;
    }
}
