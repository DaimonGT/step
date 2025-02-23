package by.bogdanov.L06_02_2025;

public class Smartphone extends ElectronicDevice {
    private int workTimeBattary;

    public Smartphone(String brand, String model, int power, int workTimeBattary) {
        super(brand, model, power);
        this.workTimeBattary = workTimeBattary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + workTimeBattary + " часа";
    }

    @Override
    public String getStatus() {
        return Smartphone.super.getModel() +" " + super.getStatus();
    }
}
