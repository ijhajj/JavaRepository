package abstraction;

public class Dodo extends Bird {
	public Dodo(String name) {
		super(name);
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("Dodo does not fly");
		
	}
	
}
