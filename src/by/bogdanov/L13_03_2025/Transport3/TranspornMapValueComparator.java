package by.bogdanov.L13_03_2025.Transport3;

import java.util.Comparator;
import java.util.Map;

public class TranspornMapValueComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return Integer.compare(o1.getValue(), o2.getValue());
    }
}
