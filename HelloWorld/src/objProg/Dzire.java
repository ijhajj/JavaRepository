package objProg;

public class Dzire extends CarNew {
	public Dzire(String name, int cylinders, String engine) {
		super(name,cylinders,engine);
	}
	@Override
	public void startEngine() {
		System.out.println("Starting Dzire");
	}
	@Override 
	public void accelerate() {
		System.out.println("Dzire Accelerating");
	}
	//No brake method
}
