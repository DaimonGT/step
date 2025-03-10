package by.bogdanov.L10_03_2025.Transport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportManager {
    static Map<String, Transport> transportByPlate = new HashMap<>();
    static Map<String, List<Transport>> transportByType = new HashMap<>();

    public static void addTransport(Transport transport) {
        transportByPlate.put(transport.getLicensePlate(), TransportFactory.next());
        transportByType.put(transport.getLicensePlate(), TransportFactory.next()); // сперва putifabsent
    }
}

