package basics.UML;

// Payment interface
interface Payment {
	void pay(double amount);
}

// This class implementing payment interface

class CreditCard implements Payment {
	public void pay(double amount) {
		System.out.println("$" +amount + " is being paid by credit card.");
	}
}

public class RealizationExample {

	public static void main(String[] args) {
		Payment creditCard = new CreditCard();
		creditCard.pay(100.00);
	}

}
