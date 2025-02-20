package by.bogdanov.L27_01_2025;

public class Therapist extends Doctors{
    @Override
    public void test(Recruit recruit) {
        if(recruit.getCardiogram() > 59 && recruit.getCardiogram() < 100) {
            recruit.setValid(true);
        } else {
            recruit.setValid(false);
            recruit.setDiagnosis("проблемы с сердцем");
        }
    }
}
