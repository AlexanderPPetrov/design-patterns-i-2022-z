package facade;

public class ShapeFacade {

	private Shape circle;
	private Shape triangle;
	
	public ShapeFacade() {
		this.circle = new Circle();
		this.triangle = new Triangle();
	}

	public void drawCircle() {
		//..
		//....
		//.....
		//.......
		this.circle.draw();
	}
	
	public void drawTriangle() {
		//..
		//....
		//.....
		//.......
		this.triangle.draw();
	}
}
