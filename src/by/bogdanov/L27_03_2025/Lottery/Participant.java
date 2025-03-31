package by.bogdanov.L27_03_2025.Lottery;

import java.util.Objects;

public class Participant {
    private final String name;
    private final int age;
    private final String sex; // String заменить на Enum Sex
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

    // уникальность по passportId
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return passportId == that.passportId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passportId);
    }
}
