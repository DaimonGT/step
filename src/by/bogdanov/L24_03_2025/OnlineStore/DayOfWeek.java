package by.bogdanov.L24_03_2025.OnlineStore;

public enum DayOfWeek {
    ;
    private int basePrice;
    private String description;

    DayOfWeek(int basePrice, String description) {
        this.basePrice = basePrice;
        this.description = description;
    }
}
