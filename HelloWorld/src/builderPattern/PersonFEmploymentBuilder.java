package builderPattern;

public class PersonFEmploymentBuilder extends PersonFBuilder{
	public PersonFEmploymentBuilder(PersonF person) {
		this.pb = person;
	}
	public PersonFEmploymentBuilder at(String companyName) {
		pb.companyName = companyName;
		return this;
	}
	public PersonFEmploymentBuilder asA(String position) {
		pb.position = position;
		return this;
	}
	public PersonFEmploymentBuilder earning(int annualIncome) {
		pb.annualIncome = annualIncome;
		return this;
	}

}
