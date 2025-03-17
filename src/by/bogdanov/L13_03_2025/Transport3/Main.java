package by.bogdanov.L13_03_2025.Transport3;

public class Main {

    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();
        TransportUserManager transportUserManager = new TransportUserManager();

        for (int i = 0; i < 20; i++) {
            Transport transport = TransportFactory.next();
            User user = UserFactory.next();
            transportManager.addTransport(transport);
            transportUserManager.addTransport(user, transport);
        }
        //transportManager.printUniqueTransport();
        System.out.println("Вывод всех транспортных средств у владельцев");
        transportUserManager.printAllOwnersAndTransport();
        System.out.println();
        System.out.println("Вывод транспортных средств у владельца:");
        transportUserManager.getTransportByOwner(new User("Дима"));
        System.out.println();
        System.out.println("Удаление транспортных средств");
        transportUserManager.removeTransport(new User("Дима"), "9999");



/*        System.out.println("Удаление транспорта");
        transportManager.removeTransport("9774");

        System.out.println();
        System.out.println("возврат транспорт по номерному знаку");
        transportManager.findTransportByPlate("9999");

        System.out.println();
        System.out.println("");

        transportManager.printUniqueTransport();

        int compare = Integer.compare(10, 10);
        System.out.println(compare);
        Integer integer = Integer.getInteger("13"); //
        System.out.println(integer);*/
    }
}
