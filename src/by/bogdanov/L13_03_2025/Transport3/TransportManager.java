package by.bogdanov.L13_03_2025.Transport3;

import java.util.*;

public class TransportManager {
    private  Map<String, Transport> transportByPlate = new HashMap<>();
    private  Map<String, List<Transport>> transportByType = new HashMap<>();

    // добавляет транспорт в 2 списка
    public void addTransport(Transport transport) {
        transportByPlate.put(transport.getLicensePlate(), transport);

        transportByType.putIfAbsent(transport.getClass().getSimpleName(), new ArrayList<>());
        transportByType.get(transport.getClass().getSimpleName()).add(transport);
    }

    //  удаляет транспорт по модели из 2 списков
    public void removeTransport(String licensePlate) {
        Transport transport = transportByPlate.remove(licensePlate);
        if (transport != null) {
            String type = transport.getClass().getSimpleName();
            transportByType.get(type).remove(transport);
            System.out.println("Удалили транспорт");
        } else {
            System.out.println("не нашли такой автомобиль по номеру " + licensePlate);
        }
    }

    //  удаляет транспорт по модели из 2 списков 2-й вариант
    public void removeTransport2(String licensePlate) {
        Transport transport = transportByPlate.remove(licensePlate);
        for (Map.Entry<String, List<Transport>> entry : transportByType.entrySet()) {
            List<Transport> value = entry.getValue();
            Iterator<Transport> iterator = value.iterator();
            while (iterator.hasNext()) {
                Transport next = iterator.next();
                if (licensePlate.equals(next.getLicensePlate())) {
                    iterator.remove();
                }
            }
        }
    }

    // Метод ищет и возвращает транспорт по номерному знаку из коллекции transportByPlate
    public Transport findTransportByPlate(String licensePlate) {
        return transportByPlate.get(licensePlate);
    }

    // метод возврата коллекции по типу
    public List<Transport> getTransportByType(String type) {
        return transportByType.getOrDefault(type, null);
    }

// метод возвращает самый быстрый транспорт данного типа из коллекции transportByType

    public Transport getFastestTransportByType(String type) {
        List<Transport> transports = transportByType.get(type);
        transports.sort(Comparator.comparingInt(Transport::getSpeed));
        return transports.getLast();
    }

    // выводит в консоль все траспортные средства из transportByPlate
    public void printUniqueTransport() {
        transportByPlate.forEach((key, value) -> System.out.println(key + ": " + value));
/*        transportByType.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });*/
    }

}

