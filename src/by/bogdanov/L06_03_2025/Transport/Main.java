package by.bogdanov.L06_03_2025.Transport;

import static by.bogdanov.L06_03_2025.Transport.TransportManager.*;

public class Main {
    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();

        for (int i = 0; i < 10; i++) {
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
        transportManager.sortTransportBySpeed();
        transportManager.printAllTransport();
        transportManager.printUniqueTransport();
        System.out.println();

        System.out.println("Сортировка массивов по модели");
        transportManager.sortTransportByModel();
        transportManager.printAllTransport();
        transportManager.printUniqueTransport();
    }
}
