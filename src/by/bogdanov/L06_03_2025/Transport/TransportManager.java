package by.bogdanov.L06_03_2025.Transport;

import java.util.*;

public class TransportManager {
    static List<Transport> transportList = new ArrayList<>();
    static Set<Transport> uniqueTransportSet = new HashSet<>();

    // Добавление рандомного тарнспорта в массив
    public static void addTransport(Transport transport) {
        transportList.add(TransportFactory.next());
        uniqueTransportSet.add(TransportFactory.next());
    }

    // удаление транспорта по модели из массивов
    public static void removeTransport(List<Transport> transportList, Set<Transport> uniqueTransportSet, String model) {
        Iterator<Transport> iterator = transportList.iterator();
        Iterator<Transport> iterator1 = uniqueTransportSet.iterator();
        while (iterator.hasNext()) {
            Transport nextTransport = iterator.next();
            if (model.equals(nextTransport.getModel())) {
                iterator.remove();
            }
        }
        while (iterator1.hasNext()) {
            Transport nextTransport1 = iterator1.next();
            if (model.equals(nextTransport1.getModel())) {
                iterator1.remove();
            }
        }
    }

    // может с помощью коллекции?
    public static void sortTransportBySpeed(List<Transport> transportList, Set<Transport> uniqueTransportSet, Comparator<Transport> comparator) {
        transportList.sort(comparator);
        List<Transport> uniqueTransportList = new ArrayList<>(uniqueTransportSet); // Преобразуем set в list
        uniqueTransportList.sort(comparator);
    }

    // сортировка массивов по модели
    public static void sortTransportByModel(List<Transport> transportList, Set<Transport> uniqueTransportSet, Comparator<Transport> comparator) {
        transportList.sort(comparator);
        List<Transport> uniqueTransportList = new ArrayList<>(uniqueTransportSet); // Преобразуем set в list
        uniqueTransportList.sort(comparator);
    }

    // вывод списка тарспорта из массива transportList
    public static void printAllTransport() {
        System.out.println(transportList);
    }

    // вывод списка тарспорта из массива uniqueTransportSet
    public static void printUniqueTransport() {
        System.out.println(uniqueTransportSet);
    }

}

