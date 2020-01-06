package strategyPattern;

public class Subtract implements MathExp{

	@Override
	public double calculate(double num1, double num2) {
		System.out.println("Subtract Method : " + num1 + " - " + num2 + " = " + (num1-num2));
		return (num1-num2);
	}

}
