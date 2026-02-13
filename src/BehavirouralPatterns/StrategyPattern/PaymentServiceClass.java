package BehavirouralPatterns.StrategyPattern;

public class PaymentServiceClass implements paymentService {

	private paymentStrategy paymentStrategy;

	@Override
	public void processPayment() {
		paymentStrategy.processPayment();
	}

	public void setPaymentStrategy(paymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;     // polymorphism
	}

}
