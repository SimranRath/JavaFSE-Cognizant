package exercise8;

public class PaymentTest {
 public static void main(String[] args) {
     // Create payment strategies
     PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "12/2025");
     PaymentStrategy paypalPayment = new PayPalPayment("example@gmail.com");

     // Create payment context with credit card payment strategy
     PaymentContext paymentContext = new PaymentContext(creditCardPayment);
     paymentContext.pay(100.0);

     // Switch to PayPal payment strategy
     paymentContext.setPaymentStrategy(paypalPayment);
     paymentContext.pay(200.0);
 }
}
