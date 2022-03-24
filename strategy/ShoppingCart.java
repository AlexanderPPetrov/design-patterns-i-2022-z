package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public double getItemsPrice() {
		double price = 0;
		for(Item item: this.items) {
			price = price + item.getPrice();
		}
		return price;
	}

	public void pay(PaymentStrategy payment) {
		double amount = getItemsPrice();
		payment.pay(amount);
	}
	
}
