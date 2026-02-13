package BehavirouralPatterns.StrategyPattern;

public class StrategyPattern {

	public static void main(String[] args) {
		
		PaymentServiceClass paymentService = new PaymentServiceClass();
		
		// we can set what ever payment method is needed
		paymentStrategy debitCard = new DebitCard();
		paymentStrategy creditCard = new CreditCard();
		paymentStrategy upi = new UPI();
		
		//set payment method
		paymentService.setPaymentStrategy(debitCard);
		
		// lets process payment
		paymentService.processPayment();
		
		
		paymentService.setPaymentStrategy(upi);
		paymentService.processPayment();
		
	}

}
