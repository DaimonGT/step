package by.bogdanov.L06_03_2025.Transport;

import static by.bogdanov.L06_03_2025.Transport.TransportManager.*;

public class Main {
    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();
        TransportModelComparator comparator = new TransportModelComparator();
        TransportSpeedComparator comparator1 = new TransportSpeedComparator();

        for (int i = 0; i < 20; i++) {
            transportManager.addTransport(TransportFactory.next());
        }

        System.out.println("Добавление трансопртов в массивы");
        transportManager.printAllTransport();
        transportManager.printUniqueTransport();
        System.out.println();

        System.out.println("Удаление транспорта из массива по модели");
        removeTransport(transportList, uniqueTransportSet, "BMW");
        transportManager.printAllTransport();
        transportManager.printUniqueTransport();
        System.out.println();

        System.out.println("Сортировка массивов по скорости");
        transportManager.sortTransportBySpeed(transportList, uniqueTransportSet, comparator1);
        transportManager.printAllTransport();
        transportManager.printUniqueTransport();
        System.out.println();

        System.out.println("Сортировка массивов по модели");
        transportManager.sortTransportByModel(transportList, uniqueTransportSet, comparator);
        transportManager.printAllTransport();
        transportManager.printUniqueTransport();
    }
}
