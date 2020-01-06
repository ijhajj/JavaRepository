package objProg;

public class Chair {
	private int length;
	private int width;
	private int height;
	public Chair(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public void cSize() {
		System.out.println("Chair is having length " + getLength() + " width " + getWidth() + " height " + getHeight());
	}
	private int getLength() {
		return length;
	}
	
	private int getWidth() {
		return width;
	}
	
	private int getHeight() {
		return height;
	}

}
