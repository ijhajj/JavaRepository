package factoryPattern;

public class Add implements Calculate{

	@Override
	public void calculate(double num1, double num2) {
		System.out.println("Addition result : " + num1 + "+" + num2 + " = " + (num1+num2));
		
	}

}
