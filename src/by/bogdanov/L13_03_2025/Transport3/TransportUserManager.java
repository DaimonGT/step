package by.bogdanov.L13_03_2025.Transport3;

import java.util.*;

public class TransportUserManager {
    private final Map<User, List<Transport>> transportByOwner = new HashMap<>();

    public void addTransport(User owner, Transport transport) {
        List<Transport> transports = transportByOwner.get(owner);
        if (transports == null) {
            transports = new ArrayList<>();
            transportByOwner.put(owner, transports);
        }

        transports.add(transport);
    }

    public List<Transport> getTransportByOwner(User owner) {
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

    public User findOwnerWithMostCars() {
        Map<Integer, User> ownerWithMostCars = new TreeMap<>();
        for(Map.Entry<User, List<Transport>> entry : transportByOwner.entrySet()){
            User owner = entry.getKey();
            List<Transport> value = entry.getValue();
            ownerWithMostCars.put(value.size(), owner);
        }
        Map.Entry<Integer, User> lastEntry = ((TreeMap<Integer, User>) ownerWithMostCars).lastEntry(); // спросить что за запись и как работает
        return lastEntry.getValue();
    }

    public void printAllOwnersAndTransport(){
        transportByOwner.forEach((user, transports) -> System.out.println(user.getName() + ": " + transports));
    }
}
