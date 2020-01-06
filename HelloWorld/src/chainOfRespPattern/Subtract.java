package chainOfRespPattern;

public class Subtract implements Chain{
	private Chain nextInChain;
	@Override
	public void calculate(Number request) {
		if (request.calculationWanted == "sub") {
			System.out.println(request.num1 + " - " + request.num2 + " = " + (request.num1 - request.num2));
		}else {
			System.out.println("Not sub - pass it on");
			nextInChain.calculate(request);
		}
		
	}

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
		
	}
}
