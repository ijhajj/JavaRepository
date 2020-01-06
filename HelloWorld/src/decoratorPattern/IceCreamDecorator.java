package decoratorPattern;

public class IceCreamDecorator extends IceCream{
	IceCream topping;
	protected String seperator = ", ";
	
	public IceCreamDecorator(IceCream topping) {
		this.topping = topping;
	}
	
	@Override
	public String getDescription() {
		return topping.getDescription();
	}

	@Override
	public double cost() {
		return topping.cost();
	}

}
