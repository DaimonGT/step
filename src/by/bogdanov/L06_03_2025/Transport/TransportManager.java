package by.bogdanov.L06_03_2025.Transport;

import java.util.*;

public class TransportManager {
    static final List<Transport> transportList = new ArrayList<>();
    static final Set<Transport> uniqueTransportSet = new HashSet<>();
    static final Set<Transport> uniqueTransportTreeSet = new TreeSet<>();

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

    // сортировка массивов по скорости
    public static void sortTransportBySpeed() { // (List<Transport> transportList, Set<Transport> uniqueTransportSet, Comparator<Transport> comparator)
        transportList.sort(new TransportSpeedComparator()); // (comparator)
        List<Transport> uniqueTransportList = new ArrayList<>(uniqueTransportSet); // Преобразуем set в list
        uniqueTransportList.sort(new TransportSpeedComparator());
    }

    // сортировка массивов по модели
    public static void sortTransportByModel() { // (List<Transport> transportList, Set<Transport> uniqueTransportSet, Comparator<Transport> comparator)
        transportList.sort(new TransportModelComparator());
        List<Transport> uniqueTransportList = new ArrayList<>(uniqueTransportSet); // Преобразуем set в list
        uniqueTransportList.sort(new TransportModelComparator());
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

