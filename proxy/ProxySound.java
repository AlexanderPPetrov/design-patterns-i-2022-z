package proxy;

public class ProxySound implements Sound {

	private RealSound realSound;
	private String fileName;
	
	public ProxySound(RealSound realSound) {
		this.realSound = realSound;
	}

	@Override
	public void play() {
		// If not authorized return;
		// -----------
		
		if(this.realSound == null) {
			this.realSound = new RealSound(this.fileName);
		}
		this.realSound.play();
	}

}
