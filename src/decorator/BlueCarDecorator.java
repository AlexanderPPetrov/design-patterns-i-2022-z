package decorator;

public class BlueCarDecorator extends CarDecorator {

	public BlueCarDecorator(Car decoratedCar) {
		super(decoratedCar);
		// TODO Auto-generated constructor stub
	}
	
	public void create() {
		this.setBlueColor();
		this.decoratedCar.create();
	}
	
	private void setBlueColor() {
		System.out.println("Setting blue color");
	}

}
