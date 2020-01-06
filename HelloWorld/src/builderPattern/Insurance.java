package builderPattern;

public class Insurance {
	public Driver driver;
	public Location location;
	public Vehicle vehicle;
	public double price;
	@Override
	public String toString() {
		return "Insurance [price=" + price + "]" + "\nDriver : " + this.driver + "\nLocation : " + this.location + "\nVehicle : " + this.vehicle;
	}
	
	
	
	
}
