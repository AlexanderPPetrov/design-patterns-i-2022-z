package strategy;

public class CreditCardPayment implements PaymentStrategy {

	private String cardHolder;
	private String cardNumber;
	private String cvv;
	private String expirationDate;
	
	public CreditCardPayment(
			String cardHolder, 
			String cardNumber, 
			String cvv,
			String expirationDate
			) {
		this.cardHolder = cardHolder;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expirationDate = expirationDate;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paying with CC: " + amount);
	}

}
