package builderPattern;

public class Location {
	String zipcode;

	public Location(String zipcode) {
		super();
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Location [zipcode=" + zipcode + "]";
	}
	
	
}
