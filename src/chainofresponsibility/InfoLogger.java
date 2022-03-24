package chainofresponsibility;

public class InfoLogger extends Logger {

	public InfoLogger() {
		this.level = Logger.INFO;
	}

	@Override
	protected void handleMessage(String message) {
		System.out.println("Info: " + message);
	}

}
