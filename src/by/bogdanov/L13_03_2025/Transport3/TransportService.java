package by.bogdanov.L13_03_2025.Transport3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            if (size > 0 && entry.getValue() < 3){
                listMap.get("1-2 машины").add(entry.getKey());
            }
            if (size > 2 && entry.getValue() < 6){
                listMap.get("3-5 машины").add(entry.getKey());
            } else {
                listMap.get("6 и более машин").add(entry.getKey());
            }
        }
        return listMap;
    }

/*    public List<String> findTop5MostPopularBrands() {
        List<Map.Entry<String, Integer>> quantityModel = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: m.e){
            quantityModel.add(entry);
        }
        quantityModel.sort(new TranspornMapValueComparator());
        //взятть последние 5
        Map<String, Integer> top5MostPopularBrands = new HashMap<>();

    }*/
}
