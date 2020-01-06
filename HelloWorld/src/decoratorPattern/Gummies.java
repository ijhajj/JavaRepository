package decoratorPattern;

public class Gummies extends IceCreamDecorator{

	public Gummies(IceCream topping) {
		super(topping);
	}
	public String getDescription() {
		return super.getDescription() + seperator + "Gummies";
	}
	public double cost() {
		return super.cost()+0.50;
	}

}
