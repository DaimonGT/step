package by.bogdanov.L10_03_2025.Transport;

import java.util.Comparator;

public class TransportSpeedComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
       return Integer.compare(o1.getSpeed(), o2.getSpeed());
    }
}
