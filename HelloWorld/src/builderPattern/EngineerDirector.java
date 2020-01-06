package builderPattern;

public class EngineerDirector {
	private InsuranceBuilder insuranceBuild1;
	
	public EngineerDirector(InsuranceBuilder insuranceBuilder) {
		this.insuranceBuild1 = insuranceBuilder;
	}
	public Insurance returnInstance() {
		return this.insuranceBuild1.getInsurance();
	}
	public void constructInsurance() {
		//order in which complex objects need to be created
		this.insuranceBuild1.buildDriver();
		this.insuranceBuild1.buildLocation();
		this.insuranceBuild1.buildVehicle();
		
	}
}
