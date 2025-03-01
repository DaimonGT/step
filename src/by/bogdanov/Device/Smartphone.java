package by.bogdanov.Device;

public class Smartphone extends Device implements Chargeable {
    private int cameraResolution;


    public Smartphone(String serialNumber, String model, int cameraResolution, int batteryLevel) {
        super(serialNumber, model, batteryLevel);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + " , разрешение камеры: " + cameraResolution;
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
