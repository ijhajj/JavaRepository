package builderPattern;

public class PersonF {
	//address		- will create addressBuilder
	public String streetAddress,postcode,city;
	//employment	- will create employmentBuilder
	public String companyName,position;
	public int annualIncome;
	@Override
	public String toString() {
		return "PersonF [streetAddress=" + streetAddress + ", postcode=" + postcode + ", city=" + city
				+ ", companyName=" + companyName + ", position=" + position + ", annualIncome=" + annualIncome + "]";
	}
	
	

}
