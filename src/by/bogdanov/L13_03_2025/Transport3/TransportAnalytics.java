package by.bogdanov.L13_03_2025.Transport3;

import java.util.*;

public class TransportAnalytics {
    private final List<Transport> transportAnalitics = new ArrayList<>();

    public void addTransport(Transport transport){
        transportAnalitics.add(transport);
    }

    public List<Transport> filterByYear(int year) {
        List<Transport> filterByYear = new ArrayList<>();
        for (Transport tr : transportAnalitics) {
            if(tr.getYear()<=year){
                filterByYear.add(tr);
            }
        }
        return filterByYear;
    }
    public List<Transport> findTop3fastest(){
        List<Transport> top3Fastest = new ArrayList<>();
        int size = transportAnalitics.size();
        transportAnalitics.sort(new TransportSpeedComparator());
        if(transportAnalitics.size() >=3) {
            top3Fastest.add(transportAnalitics.get(size-1));
            top3Fastest.add(transportAnalitics.get(size-2));
            top3Fastest.add(transportAnalitics.get(size-3));
        }
        return top3Fastest;
    }

    public Set<String> getUniqueBrands() {
        Set<String> uniqueBrands = new HashSet<>();
        for (Transport transport : transportAnalitics) {
            uniqueBrands.add(transport.getModel());
        }
        return uniqueBrands;
    }

    public Map<String, List<Transport>> groupBySpeedRange(){
        Map<String, List<Transport>> rangeBySpeed = Map.of();
        for (Transport tr : transportAnalitics) {
            if(tr.getSpeed() < 100) {
                rangeBySpeed.get("Медленный").add(tr);
            } else if (tr.getSpeed() >= 100 && tr.getSpeed() <= 200) {
                rangeBySpeed.get("Средний").add(tr);
            } else {
                rangeBySpeed.get("Быстрый").add(tr);
            }
        }
        return rangeBySpeed;
    }
}
