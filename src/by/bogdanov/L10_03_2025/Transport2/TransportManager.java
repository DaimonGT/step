package by.bogdanov.L10_03_2025.Transport2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportManager {
    static Map<String, Transport> transportByPlate = new HashMap<>();
    static Map<String, List<Transport>> transportByType = new HashMap<>();

    public void addTransport(Transport transport) {
        transportByPlate.put(transport.getLicensePlate(), transport);
        transportByType.putIfAbsent(transport.getClass().getSimpleName(), new ArrayList<>());
        transportByType.get(transport.getClass().getSimpleName()).add(transport);
    }

    public void printUniqueTransport() {
        transportByPlate.forEach((key, value) -> System.out.println(key + ": " + value));
        transportByType.forEach((key, value) -> {
           System.out.println(key + ": " + value);
        });
    }
    public static void removeTransport(String licensePlate) {
        transportByPlate.remove(licensePlate);
        transportByType.remove(licensePlate);
    }

    public Transport findTransportByPlate(String licensePlate) {
        Transport transport = transportByPlate.get(licensePlate);
        if (licensePlate.equals(transport.getLicensePlate())) {
            return transport;
        } else {
            System.out.println("Транспорт с номерным знаком " + licensePlate + " не найден");
        }
        return transport;
    }

    public List getTransportByType(String type){
        List<Transport> transportByTypeCollections = new ArrayList<>();
        if(type.equals(transportByType.getClass())) {
            return
        }
    }

}
