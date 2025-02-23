package by.bogdanov.L06_02_2025;

public class ElectronicDevice {
    private String brand;
    private String model;
    private int power;
    private boolean isOn = false;

    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(model + " от " + brand + " включен");
    }
    public void turnOff() {
        isOn = false;
        System.out.println(model + " от " + brand + " выключен");
    }


    @Override
    public String toString() {
        return "Устройство: " + brand + " " + model + ", мощность: " + power + " Вт";
    }

    public String getStatus() {
        return isOn == true ? "включено" : "выключено";
    }

}
