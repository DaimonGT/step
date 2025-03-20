package by.bogdanov.L13_03_2025.Transport3;

import java.time.Year;
import java.util.*;

public class TransportService {
    private final List<Transport> transports = new ArrayList<>();

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    // поиск владельца по licensePlate
    public User findOwnerByLicensePlate(String licensePlate) {
        for (Transport transport : transports) {
            if (licensePlate.equals(transport.getLicensePlate())) {
                return transport.getUser();
            }
        }
        return null;
    }

    // Группировка владельцев по количеству машин
    public Map<String, List<User>> groupOwnersByCarCount() {
        Map<String, List<User>> listMap = Map.of("1-2 машины", new ArrayList<>(), "3-5 машины", new ArrayList<>(), "6 и более машин", new ArrayList<>());
        Map<User, Integer> userIntegerMap = new HashMap<>();
        for (Transport tr : transports) {
            User user = tr.getUser();
            userIntegerMap.putIfAbsent(user, 1);
            if (userIntegerMap.containsKey(user)) {
                Integer sizeTransports = userIntegerMap.get(user);
                userIntegerMap.put(user, ++sizeTransports);
            }
        }
        for (Map.Entry<User, Integer> entry : userIntegerMap.entrySet()) {
            Integer size = entry.getValue();
            if (size > 0 && entry.getValue() < 3) {
                listMap.get("1-2 машины").add(entry.getKey());
            }
            if (size > 2 && entry.getValue() < 6) {
                listMap.get("3-5 машины").add(entry.getKey());
            } else {
                listMap.get("6 и более машин").add(entry.getKey());
            }
        }
        return listMap;
    }

    public List<String> findTop5MostPopularBrands() {
        Map<String, Integer> brandcount = new HashMap<>();
        List<String> topFiveEntries = new ArrayList<>();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(brandcount.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        });
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            topFiveEntries.add(list.get(i).getKey());
        }
        return topFiveEntries;
    }
/*    public Map<String, List<Transport>> groupByAge(){
        Map<String, List<Transport>> ageCategories = Map.of("1-2 машины", new ArrayList<>(), "3-5 машины", new ArrayList<>(), "6 и более машин", new ArrayList<>());
        for (Transport transport : transports) {
            int age = Year.now()
        }*/

    public Map<String, Integer> countTransportByType() {
        Map<String, Integer> countTypeTransports = new HashMap<>();
        for (Transport transport : transports) {
            String simpleName = transport.getClass().getSimpleName();
            countTypeTransports.put(simpleName, countTypeTransports.getOrDefault(simpleName, 0) + 1);

        }
        return countTypeTransports;
    }
}
