package builderPattern;

public class PersonFAddressBuilder extends PersonFBuilder{
	public PersonFAddressBuilder(PersonF person) {
		this.pb = person;
	}
	public PersonFAddressBuilder at(String streetAddress) {
		pb.streetAddress = streetAddress;
		return this;
	}
	public PersonFAddressBuilder postCode(String postcode) {
		pb.postcode = postcode;
		return this;
	}
	public PersonFAddressBuilder in(String city) {
		pb.city = city;
		return this;
	}
}
