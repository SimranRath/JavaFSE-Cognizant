package exercise4;

public class PaymentProcessorTest {
 public static void main(String[] args) {
     // Create payment gateways
     PayPalGateway paypalGateway = new PayPalGateway();
     StripeGateway stripeGateway = new StripeGateway();
     BankTransferGateway bankTransferGateway = new BankTransferGateway();

     // Create adapters
     PayPalAdapter paypalAdapter = new PayPalAdapter(paypalGateway);
     StripeAdapter stripeAdapter = new StripeAdapter(stripeGateway);
     BankTransferAdapter bankTransferAdapter = new BankTransferAdapter(bankTransferGateway);

     // Process payments
     paypalAdapter.processPayment("john.doe@example.com", 100.0);
     stripeAdapter.processPayment("1234-5678-9012-3456", 200.0);
     bankTransferAdapter.processPayment("1234567890", 300.0);
 }
}
