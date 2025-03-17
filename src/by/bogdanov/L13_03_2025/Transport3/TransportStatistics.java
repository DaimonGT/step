package by.bogdanov.L13_03_2025.Transport3;

import java.util.HashMap;
import java.util.Map;

public class TransportStatistics {
    private final Map<String, Integer> brandCount = new HashMap<>();
    private int count = 0;

    public void addTransport(Transport transport) {
        count = ++ count; // тут явно не то
        brandCount.put(transport.getModel(), count);
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
