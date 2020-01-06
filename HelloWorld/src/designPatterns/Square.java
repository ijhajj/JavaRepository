package designPatterns;

public class Square extends Rectangle{
	public Square() {
		
	}
	public Square(int size) {
		width = height = size;
	}
	public void setWidth(int width) {
		super.setWidth(width);
		//forcefully am going to set the height same as the width
		super.setHeight(width);
	}
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}
	

}
