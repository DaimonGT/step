package by.bogdanov.L06_02_2025;

public abstract class ElectronicDevice {
    private String brand;
    private String model;
    private int power;
    protected boolean isOn = false;


    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public abstract void turnOn(); // абстрактный мнтод
    public abstract void turnOff(); // абстрактный мнтод
    public abstract String getStatus();


    @Override
    public String toString() {
        return "Устройство: " + brand + " " + model + ", мощность: " + power + " Вт";
    }

}
