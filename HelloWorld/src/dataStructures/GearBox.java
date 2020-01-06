package dataStructures;

public class GearBox {
	private boolean clutchIsIn;
	//previous way of doing it
	/*public void operateClutch(String inOrOut) {
		this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
	}*/
	//better way
	public void operateClutch(boolean inOrOut) {
		this.clutchIsIn = inOrOut;
	}
}
