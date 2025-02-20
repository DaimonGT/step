package by.bogdanov.L27_01_2025;

import java.util.ArrayList;
import java.util.List;

public class Task00 {
    public static void main(String[] args) {
        Commission commission = new Commission(); // создали комиссию
        RecruitGenerator recruitGenerator = new RecruitGenerator();
        List<Recruit> inArmy = new ArrayList<Recruit>();
        List<Recruit> outArmy = new ArrayList<Recruit>();

        Recruit recruit1 = new Recruit("А", "Б", "А", 1.0, false, 11, 67);
        commission.test(recruit1);
        System.out.println(recruit1.displayInfo());
        System.out.println(recruit1);
        System.out.println();

        // цикл для генерации 1000 новобранцев, проверки на годность и на распределение в массивы
        for (int i = 0; i < 1000; i++) {
            Recruit recruit = recruitGenerator.generate();
            commission.test(recruit);
            if (recruit.isValid()) {
                inArmy.add(recruit);
            } else {
                outArmy.add(recruit);
            }
        }

        // вывод рекрутов годных в армию
        System.out.println("Годные в армию");
        System.out.println("_____________________________");
        for (Recruit recruit : inArmy) {
            System.out.println(recruit);
        }

        // вывод рекрутов не годных в армию
        System.out.println();
        System.out.println("Не годные в армию");
        System.out.println("_____________________________");
        for (Recruit recruit : outArmy) {
            System.out.println(recruit);
        }
    }
}

