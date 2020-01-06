package builderPattern;

public interface InsuranceBuilder {
	void buildDriver();
	void buildLocation();
	void buildVehicle();
	Insurance getInsurance();
}
