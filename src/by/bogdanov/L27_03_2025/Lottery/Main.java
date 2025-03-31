package by.bogdanov.L27_03_2025.Lottery;

public class Main {
    public static void main(String[] args) {
        //LotteryMachine<String> lotto1 = new LotteryMachine<>();
        LotteryMachine<Participant> lotto = new LotteryMachine<>();
        for (int i = 0; i < 20; i++) {
            Participant participant = ParticipantFactory.next();
            lotto.add(participant);
        }

        // Добавляем участников (Старое)
/*        lotto1.add("Катя");
        lotto1.add("Олег");
        lotto1.add("Аня");
        lotto1.add("Настя");
        lotto1.add("Оля");*/

       System.out.println("🎰 Первый розыгрыш:");
        String name;
        while ((name = String.valueOf(lotto.pick())) != null) {
            System.out.println("Выбран: " + name);
        }

        System.out.println("\n🔁 Новый розыгрыш:");
        lotto.reset();
        while ((name = String.valueOf(lotto.pick())) != null) {
            System.out.println("Снова выбран: " + name);
        }
    }

}
