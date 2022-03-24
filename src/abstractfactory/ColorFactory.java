package abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String colorName) {
		if(colorName.equals("GREEN")) {
			return new Green();
		}
		if(colorName.equals("BLUE")) {
			return new Blue();
		}
		System.out.println("Unknown color");
		return null;
	}

	@Override
	Shape getShape(String shapeName) {
		System.out.println("It's a color factory...");
		return null;
	}

}
