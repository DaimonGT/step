package by.bogdanov.L20_03_2025;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    private Queue<String> queue = new LinkedList<>();
    private final int maxCapacity;

    public Elevator(int maxCapacity) {
        this.queue = queue;
        this.maxCapacity = maxCapacity;
    }

    public void enter(String person) {
        if (!isFull()) {
            queue.add(person);
            System.out.println(person + " зашел в лифт.");
        } else {
            System.out.println(person + " не может войти, лифт переполнен.");
        }
    }

    public String exit() {
        if (queue.isEmpty()) {
            return "Лифт пуст, выходить некому";
        } else {
            String name = queue.poll();
            return name + " вышел из лифта.";
        }
    }

    public int getCurrentPassengers() {
        int size = queue.size();
        return size;
    }

    public String peekNextToExit() {
        if (queue.isEmpty()) {
            return "Лифт пустой";
        } else {
            String name = queue.peek();
            return "Следующий выйдет: " + name;
        }
    }

    public boolean isFull() {
        if (queue.size() < maxCapacity) {
            return false;
        } else {
            return true;
        }
    }
}