package chainOfRespPattern;

public class Divide implements Chain{
	private Chain nextInChain;
	@Override
	public void calculate(Number request) {
		if (request.calculationWanted == "div") {
			System.out.println(request.num1 + " / " + request.num2 + " = " + (request.num1 / request.num2));
		}else {
			System.out.println("Not divide - invalid Choice");
		}
		
	}

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = null;		
	}
}
