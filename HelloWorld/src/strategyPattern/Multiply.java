package strategyPattern;

public class Multiply implements MathExp{

	@Override
	public double calculate(double num1, double num2) {
		System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + (num1*num2));
		return (num1*num2);
	}

}
