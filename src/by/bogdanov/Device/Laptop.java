package by.bogdanov.Device;

public class Laptop extends Device implements Chargeable {
    private int batteryLife;

    public Laptop(String serialNumber, String model, int batteryLevel, int batteryLife) {
        super(serialNumber, model, batteryLevel);
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return super.toString() + " ,время работы от батареи: " + batteryLife + " ч.";
    }

    @Override
    public void charge(int amount) {
        if(getBatteryLevel() + amount < 100) {
            setBatteryLevel(getBatteryLevel() + amount);
        } else {
            setBatteryLevel(100);
        }
    }
}
