package designPatterns;

public class Rectangle {
	protected int width, height;
	
	public Rectangle() {
		System.out.println("Rectangle default constructor called");
	}
	public Rectangle(int width,int height) {
		this.width = width;
		this.height = height;
		System.out.println("Rectangle Parameterized constructor called");
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	public int getArea() {
		return width*height;
	}
	
}
