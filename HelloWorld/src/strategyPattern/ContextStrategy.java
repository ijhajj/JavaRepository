package strategyPattern;

public class ContextStrategy {
	MathExp exp;
	
	public ContextStrategy(MathExp exp) {
		this.exp = exp;
	}
	//Method to expose the interface method
	public double executeStrategy(double num1,double num2) {
		return exp.calculate(num1, num2);
	}
}
