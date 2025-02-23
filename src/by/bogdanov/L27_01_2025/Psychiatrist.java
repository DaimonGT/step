package by.bogdanov.L27_01_2025;

import java.util.Random;

public class Psychiatrist extends Doctors {

    @Override
    public void test(Recruit recruit) {
        Random random = new Random();
        if(random.nextBoolean()) {
            recruit.setValid(false);
            recruit.setDiagnosis("шизофрения");
        } else {
            recruit.setValid(true);
        }
    }
}
