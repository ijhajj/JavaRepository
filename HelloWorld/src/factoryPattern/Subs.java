package factoryPattern;

public class Subs implements Calculate{
	public void calculate(double num1,double num2) {
		System.out.println("Substraction result : " + num1 + "-" + num2 + " = " + (num1-num2));
	}
}
