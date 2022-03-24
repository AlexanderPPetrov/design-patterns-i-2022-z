package factorymethod;

public class CowMilk extends FarmProduct {
	
//	private double price;
//	private String name;
//	
//	public CowMilk(String name, double price) {
//		this.name = name;
//		this.price = price;
//	}

	@Override
	public void prepare() {
		System.out.println("Preparing cow milk");
	}

}
