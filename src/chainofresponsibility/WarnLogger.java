package chainofresponsibility;

public class WarnLogger extends Logger {

	
	public WarnLogger() {
		this.level = Logger.WARN;
	}

	@Override
	protected void handleMessage(String message) {
		System.out.println("Warn: " + message);
	}

}
