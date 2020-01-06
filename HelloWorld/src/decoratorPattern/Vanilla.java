package decoratorPattern;

public class Vanilla extends IceCream{

	@Override
	public String getDescription() {
		return "Vanilla Flavour";
	}

	@Override
	public double cost() {
		return 1.00;
	}

}
