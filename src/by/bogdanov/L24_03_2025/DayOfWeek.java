package by.bogdanov.L24_03_2025;

public enum DayOfWeek {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    private final String russianName;
    private final int numOfDays;

    DayOfWeek(String russianName, int numOfDays) {
        this.russianName = russianName;
        this.numOfDays = numOfDays;
    }

    public String getRussianName() {
        return russianName;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "russianName='" + russianName + '\'' +
                ", numOfDays=" + numOfDays +
                '}';
    }
}
