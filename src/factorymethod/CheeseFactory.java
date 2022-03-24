package factorymethod;

public class CheeseFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String name) {
		if(name.equals("COW_CHEESE")) {
			return new CowCheese();
		}
		if(name.equals("GOAT_CHEESE")) {
			return new GoatCheese();
		}
		System.out.println("Unknown cheese product");
		return null;
	}

}
