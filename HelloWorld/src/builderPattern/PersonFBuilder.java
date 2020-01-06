package builderPattern;

public class PersonFBuilder {
	protected PersonF pb = new PersonF();
	
	//include the Address Builder
	public PersonFAddressBuilder lives() {
		return new PersonFAddressBuilder(pb);
	}
	
	public PersonFEmploymentBuilder works() {
		return new PersonFEmploymentBuilder(pb);
	}
	
	public PersonF build() {
		return pb;
	}

}
