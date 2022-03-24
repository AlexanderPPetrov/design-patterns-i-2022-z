package abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String colorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeName) {
		if(shapeName.equals("CIRCLE")) {
			return new Circle();
		}
		if(shapeName.equals("TRIANGLE")) {
			return new Triangle();
		}
		System.out.println("Unknown shape");
		return null;
	}

}
