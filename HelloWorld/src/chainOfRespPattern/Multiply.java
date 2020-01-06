package chainOfRespPattern;

public class Multiply implements Chain{
	private Chain nextInChain;
	@Override
	public void calculate(Number request) {
		if (request.calculationWanted == "mul") {
			System.out.println(request.num1 + " * " + request.num2 + " = " + (request.num1 * request.num2));
		}else {
			System.out.println("Not multiply - pass it on");
			nextInChain.calculate(request);
		}
		
	}

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
		
	}
}
