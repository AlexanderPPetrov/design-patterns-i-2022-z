package chainofresponsibility;

public class ErrorLogger extends Logger {

	public ErrorLogger() {
		this.level = Logger.ERROR;
	}

	@Override
	protected void handleMessage(String message) {
		System.out.println("Error: " + message);
	}

}
