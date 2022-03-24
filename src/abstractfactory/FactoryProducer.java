package abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryName) {
		
		if(factoryName.equals("SHAPE")) {
			return new ShapeFactory();
		}
		if(factoryName.equals("COLOR")) {
			return new ColorFactory();
		}
		System.out.println("Unknown factory");
		return null;
	}
}
