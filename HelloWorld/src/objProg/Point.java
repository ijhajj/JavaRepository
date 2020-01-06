package objProg;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		//System.out.println("Empty Constructor Called");
	}
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		Point p2 = new Point(0,0);
		double dis = Math.sqrt(((this.x-p2.x)*(this.x-p2.x))+((this.y-p2.y)*(this.y-p2.y)));
		return dis;
	}
	
	public double distance(int x,int y) {
		Point p2 = new Point(x,y);
		double dis = Math.sqrt(((this.x-p2.x)*(this.x-p2.x))+((this.y-p2.y)*(this.y-p2.y)));
		return dis;
	}
	
	public double distance(Point p2) {
		double dis = Math.sqrt(((this.x-p2.x)*(this.x-p2.x))+((this.y-p2.y)*(this.y-p2.y)));
		return dis;
	}
}
