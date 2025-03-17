package by.bogdanov.L13_03_2025.Transport3;

import java.util.HashMap;
import java.util.Map;

public class TransportStatistics {
    private final Map<String, Integer> brandCount = new HashMap<>();

    public void addTransport(Transport transport) {
        String model = transport.getModel();
        if(brandCount.containsKey(model)){
            int count = brandCount.get(model);
            brandCount.put(model, ++count);
        }
        else {
            brandCount.put(model, 1);
        }
    }

    public int getBrandCount(String brand) {
        Integer countBrand = brandCount.getOrDefault(brand, 0);
        return countBrand;
    }

    public void printBrandStatistics(){
        for (Map.Entry<String, Integer> entry : brandCount.entrySet()) {
            String brand = entry.getKey();
            Integer quantity = entry.getValue();
            System.out.println("Бренд: " + brand + " кол-во: " + quantity);
        }
    }
}
