package by.bogdanov.L06_02_2025;

public class Television extends ElectronicDevice {
    private int workTimeBattary;

    public Television(String brand, String model, int power, int workTimeBattary) {
        super(brand, model, power);
        this.workTimeBattary = workTimeBattary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + workTimeBattary + " часов";
    }

    @Override
    public String getStatus() {
        return super.getModel() + " " + super.getStatus();
    }
}
