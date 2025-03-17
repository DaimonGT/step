package by.bogdanov.L13_03_2025.Transport3;

import java.util.*;

public class TransportSpeedGrouper {
    private final Map<Integer, Set<Transport>> transportBySpeed = new HashMap<>();

    public void addTransport(Transport transport) {
        transportBySpeed.putIfAbsent(transport.getSpeed(), new HashSet<>());
        transportBySpeed.get(transport.getSpeed()).add(transport);
    }
    public Set<Transport> getTransportBySpeed(int speed){
        return transportBySpeed.getOrDefault(speed, new HashSet<>());
    }
}
