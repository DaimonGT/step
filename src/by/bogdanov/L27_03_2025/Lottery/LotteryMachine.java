package by.bogdanov.L27_03_2025.Lottery;

import java.util.*;

public class LotteryMachine<T extends Participant> {
    private List<T> allItems = new ArrayList<>();
    private Queue<T> queue = new ArrayDeque<>();
    private Set<T> winners = new HashSet<>();
    private boolean initialized;
    private static final int MAX_WINNERS = 2;
    private int countRoundWinners = 0;

    // новый метод add
    public void add(T participant) {
        if (!initialized) {
            if (participant.getAge() >= 18) {
                allItems.add(participant);
            }
        }
    }

    public void init() {
        if (!initialized) {
            Collections.shuffle(allItems);
            queue.addAll(allItems);
            initialized = true;
        }
    }

    // Ограничить максимальное количество победителей до 2
    public T pick() {
        if (!initialized) {
            init();
        }
        if (winners.size() == MAX_WINNERS) {
            return null;
        }
        T winner = queue.poll();
        if (winner != null) {
            countRoundWinners++;
            allItems.remove(winner);
            winners.add(winner);
        }
        return winner;
    }


    public void reset() {
        initialized = false;
        queue.clear();
        init();
        countRoundWinners = 0;
    }

    public int remaining() {
        return queue.size();
    }

    public Map<String, Integer> ageToWinners() {
        Map<String, Integer> map = new HashMap<>(Map.of("18-30 лет", 0, "30-50 лет", 0, "50 и больше", 0));
        for (T winner : winners) {
            int age = winner.getAge();
            if (age < 30) {
                map.put("18-30 лет", map.get("18-30 лет") + 1);
            }
            if (age > 30 && age < 50) {
                map.put("30-50 лет", map.get("30-50 лет") + 1);
            }
            if (age > 50) {
                map.put("50 и больше", map.get("50 и больше") + 1);
            }
        }
        return map;
    }

    // Метод который подсчитывает статистику победеителей по полу
    Map<String, Integer> sexToWinners() {
        Map<String, Integer> sexWinners = new HashMap<>();
        int maleWinners = 0;
        int femaleWinners = 0;
        for (T winner : winners) {
            if ("Мужской".equals(winner.getName())) {
                maleWinners++;
            } else {
                femaleWinners++;
            }
        }
        sexWinners.put("Мужской", maleWinners);
        sexWinners.put("Женский", maleWinners);
        return sexWinners;
    }
}
