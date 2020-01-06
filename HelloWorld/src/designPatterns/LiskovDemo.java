package designPatterns;

public class LiskovDemo {
	static void useIt(Rectangle r) {
		int width = r.getWidth();
		r.setHeight(10);
		System.out.println("Expected Area : " + (width*10) + " , got : " + r.getArea());
	}

	public static void main(String[] args) {
		Rectangle rc = new Rectangle(2,3);
		useIt(rc);
		
		Square sq1 = new Square();
		sq1.setWidth(5);
		useIt(sq1);
		
		Rectangle sq2 = new Square();
		sq2.setWidth(5);
		useIt(sq2);
		
	}

}
