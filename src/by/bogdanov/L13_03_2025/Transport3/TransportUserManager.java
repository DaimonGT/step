package by.bogdanov.L13_03_2025.Transport3;

import java.util.*;

public class TransportUserManager {
    private final Map<User, List<Transport>> transportByOwner = new HashMap<>();

    public void addTransport(Transport transport){
        User user = transport.getUser();
        transportByOwner.putIfAbsent(user, new ArrayList<>());
    }

    public List<Transport> getTransportByOwner(User owner){
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        List<Transport> transport = transportByOwner.remove(owner);
        for (Map.Entry<User, List<Transport>> entry : transportByOwner.entrySet()) {
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

    public Transport getFastestTransport(User owner) {
        List<Transport> transports = transportByOwner.get(owner);
        transports.sort(new TransportSpeedComparator());
        return transports.getLast();
    }
}
