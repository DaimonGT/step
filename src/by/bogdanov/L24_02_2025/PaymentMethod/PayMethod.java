package by.bogdanov.L24_02_2025.PaymentMethod;

public class PayMethod {
    public static void main(String[] args) {
        PaymentMethod cash = new Cash(); // Писать класс родитя
        PaymentMethod creditCard = new CreditCard(5555555555555555L, "Дмитрий Богданов");
        PaymentMethod payPal = new PayPal("phenomenon13@mail.ru");
        PaymentMethod[] paymentMethods = {cash, creditCard, payPal};
        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(300);
        }
    }

}
