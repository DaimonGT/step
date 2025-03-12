package by.bogdanov.L10_03_2025.Transport2;

public class Main {

    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();
        for (int i = 0; i < 20; i++) {
            Transport transport = TransportFactory.next();
            transportManager.addTransport(transport);
        }
        transportManager.printUniqueTransport();
    }
}
