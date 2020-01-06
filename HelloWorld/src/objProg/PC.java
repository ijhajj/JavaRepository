package objProg;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		monitor.drawPixelAt(10, 20, "yellow");
	}
	
	
}
