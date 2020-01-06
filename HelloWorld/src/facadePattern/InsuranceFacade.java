package facadePattern;

import java.util.Date;

public class InsuranceFacade {
	//Create instances of each of the underlying Complex System
	Car car;
	Driver driver;
	Location location;
	//Set all the parameters required by the underlying systems in the constructor, ensuring user supplies them
	public InsuranceFacade(String vin,Date dob, String state) {
		this.car = new Car(vin);
		this.driver = new Driver(dob);
		this.location = new Location(state);
	}
	//create a method to invoke whichever internal methods(belonging to the subsystems) in whichever order we need
	public void getQuote() {
		car.checkCarHistory();
		driver.checkDriverDetails();
	}

}
