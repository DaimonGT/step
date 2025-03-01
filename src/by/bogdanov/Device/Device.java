package by.bogdanov.Device;

import java.util.Objects;

public class Device implements Cloneable {
    private String serialNumber;
    private String model;
    private static int totalDevices = 0;
    private int batteryLevel;

    public Device(String serialNumber, String model, int batteryLevel) {
        this.totalDevices = ++totalDevices;
        this.serialNumber = serialNumber;
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public static int getTotalDevices() {
        return totalDevices;
    }

    final String getSerialNumber() {
        return "Серийный номер устройства: " + serialNumber;
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", серийный номер: " + serialNumber + ", уровень заряда - " + batteryLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(serialNumber);
    }

    @Override
    public Device clone() {
        try {
            Device clone = (Device) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
