package by.bogdanov.Device;

public class DeviceManager {
    // выводит информацию об устройстве
    static void printDevice(Device device) {
        System.out.println(device);
    }

    // выводит информацию об устройствах
    void printDevice(Device[] devices) {
        for (Device device : devices) {
            System.out.println(device);
        }
    }
    // возвращает количество всех устройств
    int getTotalDevices(){
        return getTotalDevices();
    }

    // заряжает одно устройство
    static void chargeDevice(Chargeable device, int amount){
        device.charge(amount);
    }

    // заряжает массив устройств
    static void chargeDevice(Chargeable[] devices, int amount){
        for (int i = 0; i < devices.length; i++) {
            devices[i].charge(amount);
        }
    }
}
