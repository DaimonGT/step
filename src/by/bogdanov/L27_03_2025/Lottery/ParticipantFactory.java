package by.bogdanov.L27_03_2025.Lottery;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ParticipantFactory {
    static Random num = new Random();
    private static final List<String> names = List.of("Дима", "Оля", "Настя", "Саша", "Женя", "Влад");
    private static final List<String> sexs = List.of("Мужской", "Женский");
    private static final Set<Integer> passportsId = new HashSet<>();

    static Participant next() {
        int sizePassportsId = passportsId.size();
        int randomPassportId = num.nextInt(000000000, 999999999);
        passportsId.add(randomPassportId);
        if (sizePassportsId < passportsId.size()) {
            return new Participant(names.get(num.nextInt(names.size())), num.nextInt(100), sexs.get(num.nextInt(sexs.size())), passportsId.);
        } else {
            while (sizePassportsId == passportsId.size()){
                randomPassportId = num.nextInt(000000000, 999999999);
                passportsId.add(randomPassportId);
            }
            return new Participant(names.get(num.nextInt(names.size())), num.nextInt(100), sexs.get(num.nextInt(sexs.size())), randomPassportId);
        }
    }
}
