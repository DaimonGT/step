package by.bogdanov.OrderingSystem.config;

public class PaymentConfig {
    private static PaymentConfig instance;
    private final double cardCommissionRate = 0.02; // 2% комиссия за оплату картой

    private PaymentConfig() {}

    public static PaymentConfig getInstance() {
        if (instance == null) {
            instance = new PaymentConfig();
        }
        return instance;
    }

    public double getCardCommissionRate() {
        return cardCommissionRate;
    }

    public double calculateCommission(double amount) {
        return amount * cardCommissionRate;
    }
}
