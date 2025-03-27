package by.bogdanov.L27_03_2025.Lottery;

import java.util.*;

public class LotteryMachine<T> {
    private List<T> allItems = new ArrayList<>();
    private Queue<T> queue = new ArrayDeque<>();
    private List<T> winners = new ArrayList<>(2);
    private boolean initialized;

    public void add(T item) {
        if (!initialized) {
            allItems.add(item);
        }
    }

    public void init() {
        if (!initialized) {
            Collections.shuffle(allItems);
            queue.addAll(allItems);
            initialized = true;
        }
    }

/*    public T pick() {
        if (!initialized) {
            init();
        }
        return queue.poll();
    }*/
       public T pick() {
        if (!initialized) {
            init();
        }
           T winner = queue.poll();
           winners.add(winner);

       }


    public void reset(){
        Collections.shuffle(allItems);
        queue.clear();
        queue.addAll(allItems);
    }

    public int remaining(){
        return queue.size();
    }
}
