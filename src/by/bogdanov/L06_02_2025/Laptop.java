package by.bogdanov.L06_02_2025;

public class Laptop extends ElectronicDevice {
    private int workTimeBattary;

    public Laptop(String brand, String model, int power, int workTimeBattary) {
        super(brand, model, power);
        this.workTimeBattary = workTimeBattary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + workTimeBattary + " часов";
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return isOn ? "Ноутбук включен" : "Ноутбук выключен";
    }
}
