package factoryPattern;

public class CalculateMain {
	public static void main(String[] args) {
		CalculateFactory expression1 = new CalculateFactory();
		expression1.getCalculation("add").calculate(100, 10);
		expression1.getCalculation("Subtract").calculate(100, 10);
		expression1.getCalculation("divide").calculate(100,10);
	}
}
