package BehavirouralPatterns.StrategyPattern;

public class CreditCard implements paymentStrategy{

	@Override
	public void processPayment() {
		System.out.println("Payment is being done by Credit Card.");
	}

}
