package strategyPattern;

public class MathMain {
	public static void main(String...args) {
		MathExp exp = new Subtract();
		ContextStrategy cS1 = new ContextStrategy(exp);
		cS1.executeStrategy(100, 90);
		exp.calculate(100, 70);
		MathExp exp1 = new Add();
		exp1.calculate(100, 12);
	}

}
