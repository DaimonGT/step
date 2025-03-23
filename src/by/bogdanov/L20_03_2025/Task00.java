package by.bogdanov.L20_03_2025;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
/*        Queue<String> queue = new LinkedList<>();
        queue.offer("Дима");
        queue.offer("Коля");
        queue.offer("Женя");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println("");
        Queue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.offer(new Task(1, "Запустить сервер"));
        taskQueue.offer(new Task(3, "Проверить логи"));
        taskQueue.offer(new Task(2, "Обновить базу"));
        System.out.println(taskQueue.poll());
        System.out.println(taskQueue);
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("Первый");
        deque.offerLast("Последний");*/

        // Задача 1 Имитация автобусной остановки (Queue)
        BusStop busStop = new BusStop();
        System.out.println("Задача 1");
        busStop.addPassenger("Андрей");
        busStop.addPassenger("Сергей");
        busStop.addPassenger("Марина");
        System.out.println(busStop.peekNextPassenger());
        System.out.println(busStop.boardBus());
        System.out.println(busStop.boardBus());
        System.out.println(busStop.boardBus());
        System.out.println(busStop.boardBus());
        System.out.println();

        // Задача 2 Модель лифта (Queue)
        System.out.println("Задача 2");
        Elevator elevator = new Elevator(3);
        elevator.enter("Иван");
        elevator.enter("Мария");
        elevator.enter("Андрей");
        elevator.enter("Ольга");
        System.out.println(elevator.peekNextToExit());
        System.out.println(elevator.exit());
        System.out.println(elevator.exit());
        System.out.println(elevator.getCurrentPassengers() > 0 ? elevator.getCurrentPassengers() + " человек(а) осталось в лифте." : "Лифт пуст, выходить некому.");
        System.out.println(elevator.exit());
        System.out.println(elevator.exit());
    }
}
