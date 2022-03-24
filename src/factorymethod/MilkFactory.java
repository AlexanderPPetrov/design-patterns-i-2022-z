package factorymethod;

public class MilkFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String name) {

		if(name.equals("COW_MILK")) {
			return new CowMilk();
		}
		if(name.equals("GOAT_MILK")) {
			return new GoatMilk();
		}
		System.out.println("Unknown milk product");
		
		return null;
	}

}
