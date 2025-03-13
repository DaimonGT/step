package by.bogdanov.L10_03_2025.Transport2;

public class Main {

    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();

        for (int i = 0; i < 20; i++) {
            Transport transport = TransportFactory.next();
            transportManager.addTransport(transport);
        }
        System.out.println("Удаление транспорта");
        transportManager.removeTransport("9774");

        System.out.println();
        System.out.println("возврат транспорт по номерному знаку");
        transportManager.findTransportByPlate("9999");

        transportManager.printUniqueTransport();

    }
}
