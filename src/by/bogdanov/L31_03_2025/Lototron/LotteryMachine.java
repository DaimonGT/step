package by.bogdanov.L31_03_2025.Lototron;

import by.bogdanov.L27_03_2025.Lottery.Participant;
import by.bogdanov.L31_03_2025.Lototron.exception.MaxWinnersExceededException;
import by.bogdanov.L31_03_2025.Lototron.exception.NotInitializedException;
import by.bogdanov.L31_03_2025.Lototron.exception.UnderAgeException;

import java.util.*;

public class LotteryMachine<T extends Participant> {
    private List<T> allItems = new ArrayList<>();
    private Queue<T> queue = new ArrayDeque<>();
    private Set<T> winners = new HashSet<>();
    private boolean initialized;
    private static final int MAX_WINNERS = 2;
    private int countWinners = 0;

    // новый метод add
    public void add(T participant) throws UnderAgeException, DuplicateFormatFlagsException {
        if (!initialized) {
            if (participant.getAge() >= 18) {
                allItems.add(participant);
            } else {
                throw new UnderAgeException("Участнику меньше 18 лет");
            }
        } if(allItems.contains(participant)) {
            throw new DuplicateFormatFlagsException("Участник с такими паспортными данными уже есть");
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
    public T pick() throws MaxWinnersExceededException {
        if (!initialized) {
            init();
        }
        if(winners.size() > MAX_WINNERS){
            throw new MaxWinnersExceededException("Количество победителй превысило лимит");
        }
        T winner = queue.poll();
        if (winner != null) {
            countWinners++;
            allItems.remove(winner);
            winners.add(winner);
        }
        return winner;
    }


    public void reset() throws NotInitializedException {
        if(!initialized) {
            throw new NotInitializedException("Игра еще не началась");
        }
        Collections.shuffle(allItems);
        queue.clear();
        queue.addAll(allItems);
    }

    public int remaining() {
        return queue.size();
    }

    // Метод который подсчитывает статистику победеителей
    Map<String, Integer> ageToWinners() {
        Map<String, Integer> ageWinners = new HashMap<>();
        int count18To30 = 0;
        int count30To50 = 0;
        int count50 = 0;
        for (T winner : winners) {
            if (winner.getAge() >= 18 && winner.getAge() < 30) {
                count18To30++;
            } else if (winner.getAge() >= 30 && winner.getAge() < 50) {
                count30To50++;
            } else {
                count50++;
            }
        }
        ageWinners.put("18-30", count18To30);
        ageWinners.put("30-50", count30To50);
        ageWinners.put("50 и выше", count50);
        return ageWinners;
    }

    // Метод который подсчитывает статистику победеителей по полу
    Map<String, Integer> sexToWinners() {
        Map<String, Integer> sexWinners = new HashMap<>();
        int maleWinners = 0;
        int femaleWinners = 0;
        for (T winner : winners) {
            if("Мужской".equals(winner.getName())){
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
