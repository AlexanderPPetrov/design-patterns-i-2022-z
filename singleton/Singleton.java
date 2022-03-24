package singleton;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void postMessage(String message) {
		System.out.println("Post message: " + message);
	}
}
