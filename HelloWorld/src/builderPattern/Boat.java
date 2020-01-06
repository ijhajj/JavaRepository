package builderPattern;

import java.util.Scanner;

public class Boat implements InsuranceBuilder{
	Insurance insurance;
	Scanner scanner;
	
	public Boat() {
		this.insurance = new Insurance();
		scanner = new Scanner(System.in);
	}
	public void buildDriver() {
		System.out.println("Enter name of Captain : ");
		String driverName = scanner.next();
		System.out.println("Enter Age of Captain: ");
		int driverAge = scanner.nextInt();
		insurance.driver = new Driver(driverName,driverAge);
	}
	public void buildLocation() {
		System.out.println("Enter Mooring Code : ");
		String zipcode = scanner.next();
		insurance.location = new Location(zipcode);
	}
	public void buildVehicle() {
		System.out.println("Enter Model name");
		String model = scanner.next();
		System.out.println("Enter year of manufacturing : ");
		int year = scanner.nextInt();
		insurance.vehicle = new Vehicle(model,year);
	}
	@Override
	public Insurance getInsurance() {
		return insurance;
	}
}
