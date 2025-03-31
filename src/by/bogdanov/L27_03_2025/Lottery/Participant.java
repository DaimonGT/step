package by.bogdanov.L27_03_2025.Lottery;

public class Participant {
    private final String name;
    private final int age;
    private final String sex;
    private final int passportId;

    public Participant(String name, int age, String sex, int passportId) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.passportId = passportId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getPassportId() {
        return passportId;
    }
}
