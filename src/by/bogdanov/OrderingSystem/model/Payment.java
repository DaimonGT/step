package by.bogdanov.OrderingSystem.model;

public class Payment {
    private int idPayment;
    private double sumPayment;
    private PaymentMethod paymentMethod;
    private static int totalPayments = 0;

    public Payment(double sumPayment, PaymentMethod paymentMethod) {
        this.idPayment = ++totalPayments;
        // как прировнять значение переменной sumPayment к значению переменной sumPrices из класса Order?
        this.sumPayment = sumPayment;
        this.paymentMethod = paymentMethod;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public double getSumPayment() {
        return sumPayment;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
