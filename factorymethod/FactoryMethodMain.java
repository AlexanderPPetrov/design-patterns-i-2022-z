package factorymethod;

public class FactoryMethodMain {

	public static void main(String[] args) {
		
		CheeseFactory cheeseFactory = new CheeseFactory();
		FarmProduct cowCheese =
				cheeseFactory.produceProduct("COW_CHEESE");
		
		
	}

}
