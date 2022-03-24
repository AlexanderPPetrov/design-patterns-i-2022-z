package singleton;

public class SingletonMain {

	public static void main(String[] args) {

		Singleton connection = Singleton.getInstance();
		connection.postMessage("Connected");

	}

}
