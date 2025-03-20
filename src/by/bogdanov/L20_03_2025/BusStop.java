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
        //проверить размер

        String name = queue.poll();
        if (name == null) {
            return "Очередь пуста";
        } else {
            return "Следующий пассажир: " + name;
        }
    }

    public int getQueueSize() {
        int size = queue.size();
        return size;
    }

    public String peekNextPassenger() {
        return queue.peek();
    }

}
