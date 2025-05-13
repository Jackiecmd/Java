package work3.work6;

public class Application {
    public static void main(String[] args) {
        PaymentGateway creditPayment = new CreditCardPayment();
        PaymentGateway cryptoPayment = new CryptoPayment();

        creditPayment.processPayment(100.0);
        cryptoPayment.processPayment(2.5);
    }
}
