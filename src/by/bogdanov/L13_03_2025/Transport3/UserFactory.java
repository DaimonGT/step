package by.bogdanov.L13_03_2025.Transport3;

import java.util.List;
import java.util.Random;

public class UserFactory {
    private static final Random num = new Random();
    private static final List<String> names = List.of("Дима", "Саша", "Маша", "Женя");

    public static User next() {
        String randomName = names.get(num.nextInt(names.size()));
        return new User(randomName);
    }
}
