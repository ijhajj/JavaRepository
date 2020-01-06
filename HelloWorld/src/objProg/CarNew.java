package objProg;

public class CarNew {
	private String name;
	private int cylinders;
	private String engine;
	private int wheels;
	
	public CarNew(String name, int cylinders, String engine) {
		
		this.name = name;
		this.cylinders = cylinders;
		this.engine = engine;
		this.wheels = 4;
	}

	private String getName() {
		return name;
	}

	private int getCylinders() {
		return cylinders;
	}

	private String getEngine() {
		return engine;
	}

	private int getWheels() {
		return wheels;
	}

	public void startEngine() {
		System.out.println("Starting the Engine of the Car");
	}
	
	public void accelerate() {
		System.out.println("Accelerate the Car");
	}
	
	public void brake() {
		System.out.println("Applying the Brakes to the Car");
	}	
	public static void main(String[]args) {
		CarNew dz1 = new Dzire("Dzire",10,"Engine-ZZDX");
		dz1.startEngine();
		dz1.accelerate();
		dz1.brake();
		
		System.out.println(dz1.getClass().getSimpleName());
	}
}

