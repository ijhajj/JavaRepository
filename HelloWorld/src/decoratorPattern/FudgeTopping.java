package decoratorPattern;

public class FudgeTopping extends IceCreamDecorator{

	public FudgeTopping(IceCream topping) {
		super(topping);
	}
	public String getDescription() {
		return super.getDescription() + seperator + "Fudge Topping";
	}
	public double cost() {
		return super.cost() + 0.25;
	}

}
