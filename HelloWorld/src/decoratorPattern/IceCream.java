package decoratorPattern;

public abstract class IceCream {
	public abstract String getDescription();
	public abstract double cost();
	public void print() {
		System.out.println("cost " + this.cost() + ", Description : " + this.getDescription());
	}
}
