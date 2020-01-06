package strategyPattern;

public class Add implements MathExp{
	public double calculate(double num1,double num2) {
		System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1+num2));
		return (num1+num2);
	}
}
