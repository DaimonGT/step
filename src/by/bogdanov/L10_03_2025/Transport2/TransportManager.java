package by.bogdanov.L10_03_2025.Transport2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportManager {
    static Map<String, Transport> transportByPlate = new HashMap<>();
    static Map<String, List<Transport>> transportByType = new HashMap<>();

    // добавляет транспорт в 2 списка
    public void addTransport(Transport transport) {
        transportByPlate.put(transport.getLicensePlate(), transport);
        transportByType.putIfAbsent(transport.getClass().getSimpleName(), new ArrayList<>());
        transportByType.get(transport.getClass().getSimpleName()).add(transport);
    }

    //  удаляет транспорт по модели из 2 списков
    public void removeTransport(String licensePlate) {
        transportByPlate.remove(licensePlate);
        transportByType.remove(licensePlate);
    }

    // Метод ищет и возвращает транспорт по номерному знаку из коллекции transportByPlate
    public Transport findTransportByPlate(String licensePlate) {
        Transport transport = transportByPlate.get(licensePlate);
        if (licensePlate.equals(transport.getLicensePlate())) {
            return transport;
        } else {
            System.out.println("Транспорт с номерным знаком " + licensePlate + " не найден");
        }
        return transport;
    }

    // метод возврата коллекции по типу
    public List<Transport> getTransportByType(String type) {
        return transportByType.getOrDefault(type, null);
    }

    // метод возвращает самый быстрый транспорт данного типа из коллекции transportByType

    // выводит в консоль все траспортные средства из transportByPlate
    public void printUniqueTransport() {
        transportByPlate.forEach((key, value) -> System.out.println(key + ": " + value));
/*        transportByType.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });*/
    }

}

