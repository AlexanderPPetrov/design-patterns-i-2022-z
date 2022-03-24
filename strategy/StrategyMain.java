package strategy;

public class StrategyMain {

	public static void main(String[] args) {


		ShoppingCart shoppingCart = new ShoppingCart();
		Item item1 = new Item(2.5, "Morkovi");
		Item item2 = new Item(5.5, "Krastavici");
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		
		PaymentStrategy ccPayment = 
				new CreditCardPayment(
						"Ivan Ivanov",
						"1231 1232 1232 1234",
						"232",
						"11/22"
						);
		
		PaymentStrategy payPalPayment = 
				new PayPalPayment(
						"ivan@abv.bg",
						"123");
		
		shoppingCart.pay(payPalPayment);
	}

}
