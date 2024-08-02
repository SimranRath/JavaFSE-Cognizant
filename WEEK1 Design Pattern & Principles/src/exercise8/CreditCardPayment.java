package exercise8;

public class CreditCardPayment implements PaymentStrategy {
 private String cardNumber;
 private String expirationDate;

 public CreditCardPayment(String cardNumber, String expirationDate) {
     this.cardNumber = cardNumber;
     this.expirationDate = expirationDate;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Paid $" + amount + " using credit card " + cardNumber);
 }
}


