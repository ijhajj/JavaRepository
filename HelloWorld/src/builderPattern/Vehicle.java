package builderPattern;

public class Vehicle {
	String model;
	int year;
	public Vehicle(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", year=" + year + "]";
	}
	
	
}
