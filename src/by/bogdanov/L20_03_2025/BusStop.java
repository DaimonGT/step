package by.bogdanov.L20_03_2025;

import java.util.LinkedList;
import java.util.Queue;

public class BusStop {
    private Queue<String> queue = new LinkedList<>();

    public void addPassenger(String name) {
        queue.add(name);
        System.out.println(name + " Встал в очередь на автобус");
    }

    public String boardBus() {
        if (queue.isEmpty()) {
            return "Очередь пуста, автобус уезжает пустым";
        } else {
            String name = queue.poll();
            return name + " сел в автобус.";
        }
    }

    public int getQueueSize() {
        int size = queue.size();
        return size;
    }

    public String peekNextPassenger() {
        String name = queue.peek();
        return "Следующий пассажир: " + name;
    }

}
