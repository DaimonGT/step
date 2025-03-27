package by.bogdanov.L27_03_2025.Lottery;

import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class LotteryMachine <T>{
    private List<T> allItems;
    private Queue<T> queue;
    private boolean initialized;

    public List<T> getAllItems() {
        return allItems;
    }

    public Queue<T> getQueue() {
        return queue;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void add(T item){
        allItems.add(item);
    }

    public void init(){
        Collections.shuffle(allItems);
    }
}
