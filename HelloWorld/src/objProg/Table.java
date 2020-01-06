package objProg;

public class Table {
	private int length;
	private int width;
	private int height;
	public Table(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public void tSize() {
		System.out.println("Table is having length " + getLength() + " width " + getWidth() + " height " + getHeight());
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
