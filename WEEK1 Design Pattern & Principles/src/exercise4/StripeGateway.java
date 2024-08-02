package exercise4;

public class StripeGateway {

	    public void chargeCard(String cardNumber, double amount) {
	        System.out.println("Processing Stripe payment for card " + cardNumber + ": $" + amount);
	    }
	}

