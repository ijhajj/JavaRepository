package factoryPattern;

public class Divide implements Calculate{

	@Override
	public void calculate(double num1, double num2) {
		System.out.println("Divide result : " + num1 + "/" + num2 + " = " + num1/num2);
		
	}

}
