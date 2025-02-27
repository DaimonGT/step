package by.bogdanov.L24_02_2025.PaymentMethod;

import java.util.Objects;

public class CreditCard implements Cloneable, PaymentMethod {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber == that.cardNumber && Objects.equals(cardHolder, that.cardHolder);
    }

    // задача от урока 27.02.2025
    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cardHolder);
    }

    @Override
    public String toString() {
        return "Номер карты: " + cardNumber + "\nВладелец карты " + cardHolder;
    }

    @Override
    public CreditCard clone() {
        try {
            CreditCard clone = (CreditCard) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
