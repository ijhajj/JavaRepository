package factoryPattern;

public class Point {
	private double x,y;
	
	//This makes the constructor really ugly and will require some kind of documentation explaining the parameters to the use
	//This is solved by factory design pattern:
	//					firstly, make the constructor private so its not directly accessible
	//					secondly, introduce methods to access the constructor internally
	//public Point(double x,double y,CoordinateSystem cs) {
	private Point(double x,double y,CoordinateSystem cs) {
	switch(cs){
		case CARTESIAN:
			this.x = x;
			this.y = y;
			break;
		case POLAR:
			this.x = x * Math.cos(y);
			this.y = x * Math.sin(y);
			break;
	}
	}
	
	private Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	//below methods instroduced under factory method
	public static Point newCartesianPoint(double x,double y) {
		return new Point(x,y);
	}
	public static Point newPolarPoint(double x,double y) {
		return new Point(x * Math.cos(y), x * Math.sin(y));
	}
	
	
}
