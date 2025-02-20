package by.bogdanov.L27_01_2025;

public class Oculist extends Doctors {
    @Override
    public void test(Recruit recruit) {
        if(recruit.getVisionCoeff() > 0.8 && recruit.getVisionCoeff() < 1.2) {
            recruit.setValid(true);
        } else {
            recruit.setValid(false);
            recruit.setDiagnosis("плохое зрение");
        }
    }
}
