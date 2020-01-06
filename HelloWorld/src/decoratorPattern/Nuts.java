package decoratorPattern;

public class Nuts extends IceCreamDecorator{

	public Nuts(IceCream topping) {
		super(topping);
	}
	public String getDescription() {
		return super.getDescription() + seperator + "Nuts";
	}
	public double cost() {
		return super.cost() + 0.75;
	}
}
