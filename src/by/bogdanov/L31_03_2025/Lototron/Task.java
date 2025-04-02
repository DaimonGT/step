package by.bogdanov.L31_03_2025.Lototron;

import by.bogdanov.L27_03_2025.Lottery.Participant;
import by.bogdanov.L27_03_2025.Lottery.ParticipantFactory;

public class Task {
    public static void main(String[] args)  {
        LotteryMachine<Participant> lotto = new LotteryMachine<>();
        try {
            for (int i = 0; i < 10; i++) {
                Participant participant = ParticipantFactory.next();
                lotto.add(participant);
            }
        } catch ()


        System.out.println("🎰 Первый розыгрыш:");
        Participant name;
        while ((name = lotto.pick()) != null) {
            System.out.println("Выбран: " + name.getName());
        }

        System.out.println("\n🔁 Новый розыгрыш:");
        lotto.reset();
        while ((name = lotto.pick()) != null) {
            System.out.println("Снова выбран: " + name.getName());
        }

        System.out.println("Статистика по победителям");
        System.out.println(lotto.ageToWinners());
    }
}

