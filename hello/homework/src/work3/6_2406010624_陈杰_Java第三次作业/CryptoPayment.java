package work3.work6;

public class CryptoPayment extends PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing CRYPTO payment: equivalent of "+amount+"BTC");
    }
}
