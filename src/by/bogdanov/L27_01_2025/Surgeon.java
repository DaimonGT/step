package by.bogdanov.L27_01_2025;

public class Surgeon extends Doctors {
    @Override
    public void test(Recruit recruit) {
        if(!recruit.isFlatFeet()) {
            recruit.setValid(true);
        } else {
            recruit.setValid(false);
            recruit.setDiagnosis(" плоскостопие");
        }
    }
}
