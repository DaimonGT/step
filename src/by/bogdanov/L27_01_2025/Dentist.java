package by.bogdanov.L27_01_2025;

public class Dentist extends Doctors {
    
    @Override
    public void test(Recruit recruit) {
        if (recruit.getImplantCount() <= 1) {
            recruit.setValid(true);
        } else {
            recruit.setValid(false);
            recruit.setDiagnosis("более одного импланта");
        }
    }
}
