package exercise4;

	public class PayPalAdapter implements PaymentProcessor {
	    private PayPalGateway paypalGateway;

	    public PayPalAdapter(PayPalGateway paypalGateway) {
	        this.paypalGateway = paypalGateway;
	    }

	    @Override
	    public void processPayment(String paymentMethod, double amount) {
	        paypalGateway.makePayment(paymentMethod, amount);
	    }
	}

