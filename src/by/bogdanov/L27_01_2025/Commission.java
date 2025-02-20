package by.bogdanov.L27_01_2025;

public class Commission {
    private Doctors[] doctors;

    public Commission() {
        this.doctors = new Doctors[]{
                new Dentist(), new Oculist(), new Psychiatrist(), new Surgeon(), new Therapist()
        };
    }

    public void test(Recruit recruit) {
        for (Doctors doctor : doctors) {
            doctor.test(recruit);
        }
    }
}
