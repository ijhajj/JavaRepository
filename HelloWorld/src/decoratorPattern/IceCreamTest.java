package decoratorPattern;

public class IceCreamTest {
	public static void main(String args[]) {
		IceCream chocoFudge = new Chocolate();
		chocoFudge = new FudgeTopping(chocoFudge);
		chocoFudge = new Nuts(chocoFudge);
		System.out.println(chocoFudge.cost());
		System.out.println(chocoFudge.getDescription());
	}

}
