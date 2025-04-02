package by.bogdanov.L27_03_2025.Lottery;

import java.util.List;
import java.util.Random;

public class ParticipantFactory {
    static Random num = new Random();
    private static final List<String> names = List.of("Дима", "Оля", "Настя", "Саша", "Женя", "Влад");
    private static final List<String> sexs = List.of("Мужской", "Женский");

    private  ParticipantFactory() {
    }

    public static Participant next() {
        int randomPassportId = num.nextInt(000000000, 999999999);
            return new Participant(names.get(num.nextInt(names.size())), num.nextInt(100), sexs.get(num.nextInt(sexs.size())), randomPassportId);
    }
}
