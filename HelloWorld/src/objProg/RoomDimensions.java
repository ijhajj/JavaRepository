package objProg;

public class RoomDimensions {
	private double length;
	private double width;
	private double height;
	public RoomDimensions(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public void space() {
		System.out.println("Room Dimensions are width " + getWidth() + "ft Height " + getHeight() + "ft Length " +  getLength()+ "ft");
	}
	private double getLength() {
		return length;
	}
	
	private double getWidth() {
		return width;
	}
	
	private double getHeight() {
		return height;
	}
	
	
}
