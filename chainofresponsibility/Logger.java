package chainofresponsibility;

public abstract class Logger {

	public static int ERROR = 3;
	public static int WARN = 2;
	public static int INFO = 1;
	
	protected int level;
	
	protected Logger nextLogger;
	
	public void setNextLogger(Logger logger) {
		this.nextLogger = logger;
	}
	
	
	public void logMessage(int level, String message) {
		
		if(this.level <= level) {
			this.handleMessage(message);
			return;
		}
		
		if(this.nextLogger != null) {
			this.nextLogger.logMessage(level, message);
			return;
		}
		System.out.println("cannot log message");
	}
	
	abstract protected void handleMessage(String message);

}
