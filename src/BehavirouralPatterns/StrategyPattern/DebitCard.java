package BehavirouralPatterns.StrategyPattern;

public class DebitCard implements paymentStrategy{

	@Override
	public void processPayment() {
		System.out.println("Payment is being done by Debit Card.");
	}

}
