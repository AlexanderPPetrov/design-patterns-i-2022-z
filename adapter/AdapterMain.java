package adapter;

public class AdapterMain {

	public static void main(String[] args) {
		
		MediaPlayer player2 = new Vlc();
		player2.play("test2.avi");
		
		
		MediaPackage player = new Mp3();
		player.playFile("test.mp3");

		
		MediaPlayer mediaPlayer = 
				new FormatAdapter(player);
		
		mediaPlayer.play("test.avi");

		
		
	}

}
