package factoryPattern;

public class CalculateFactory {
	public Calculate getCalculation(String type) {
		
		switch(type.toLowerCase()){
			case("add"):
				return new Add();
			case("subtract"):
				return new Subs();
			case("divide"):
				return new Divide();
			default:
				return null;
				
		}
	}

}
