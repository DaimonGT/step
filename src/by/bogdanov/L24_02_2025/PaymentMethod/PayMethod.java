package by.bogdanov.L24_02_2025.PaymentMethod;

public class PayMethod {
    public static void main(String[] args) {
        PaymentMethod cash = new Cash(); // Писать класс родитя
        PaymentMethod creditCard = new CreditCard(5555555555555555L, "Дмитрий Богданов");
        PaymentMethod payPal = new PayPal("phenomenon13@mail.ru");
        PaymentMethod creditCard1 = new CreditCard(5555555555555555L, "Дмитрий Богданов");
        PaymentMethod payPal1 = new PayPal("DaimonGT@Mail.ru");
        PaymentMethod payPal2 = new PayPal("DaimonGT@Mail.ru");
        PaymentMethod[] paymentMethods = {cash, creditCard, payPal};

/*        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(300);
        }*/
        // сравнение через equals
        System.out.println("Задание от 27.02");
        System.out.println("Сравнение creditCard и creditCard1 через .equals вернёт true: " + creditCard.equals(creditCard1));
        System.out.println("Сравнение creditCard и creditCard1 через == " + (creditCard == creditCard1));
        System.out.println("Сравнение payPal и payPal1 через .equals вернёт false: " + payPal.equals(payPal1));
        System.out.println("Сравнение payPal и payPal1 через == " + payPal.equals(payPal1));
        System.out.println();
        // вывод переопределенного метода toString
        System.out.println(creditCard.toString());
        System.out.println(creditCard1.toString());
        System.out.println();
        // Использование метода clone
    }

}
