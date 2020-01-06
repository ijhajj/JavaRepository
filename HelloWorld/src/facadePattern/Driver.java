package facadePattern;

import java.util.Date;
//Represents the Driver subsystem
public class Driver {
	Date dob;
	//Needs DOB
	public Driver(Date dob) {
		this.dob = dob;
	}
	
	public void checkDriverDetails() {
		System.out.println("Check Driver history " + dob);
	}

}
