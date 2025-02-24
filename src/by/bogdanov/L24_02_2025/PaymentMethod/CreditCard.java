package by.bogdanov.L24_02_2025.PaymentMethod;

public class CreditCard implements PaymentMethod {
    private long cardNumber;
    private final String cardHolder;

    public CreditCard(long cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " с кредитной карты " + cardHolder);
    }
}
