package decoratorPattern;

public class Chocolate extends IceCream{

	@Override
	public String getDescription() {
		return "Chocolate Flavour";
	}

	@Override
	public double cost() {
		return 2.00;
	}

}
