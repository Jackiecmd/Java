package work3.work6;

public class CreditCardPayment extends PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing CREDIT payment: " + amount);
    }
}
