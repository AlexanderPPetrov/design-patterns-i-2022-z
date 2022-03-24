package chainofresponsibility;

public class ChainOfResponsibilityMain {

	public static void main(String[] args) {


		Logger errorLogger = new ErrorLogger();
		Logger warnLogger = new WarnLogger();
		Logger infoLogger = new InfoLogger();
		
		
		errorLogger.setNextLogger(warnLogger);
		warnLogger.setNextLogger(infoLogger);
		
		errorLogger.logMessage(4, "Error message");
		errorLogger.logMessage(2, "Warning message");

	}

}
