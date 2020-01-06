package facadePattern;
//Represents the Location subsystem
public class Location {
	String state;
	//Needs State
	public Location(String state) {
		this.state = state;
	}
	
	public void checkDrivingConditions() {
		System.out.println("Get location information for " +  state);
	}

}
