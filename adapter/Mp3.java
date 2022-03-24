package adapter;

public class Mp3 implements MediaPackage {

	@Override
	public void playFile(String fileName) {
		System.out.println("Playing mp3: " + fileName);
	}

}
