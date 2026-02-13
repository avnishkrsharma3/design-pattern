package BehavirouralPatterns.StrategyPattern;

public class UPI implements paymentStrategy{

	@Override
	public void processPayment() {
		System.out.println("Payment is being done by UPI.");
	}

}
