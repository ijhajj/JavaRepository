package builderPattern;

public class TestInsurance {

	public static void main(String[] args) {
		InsuranceBuilder nyBenz = new Auto();
		EngineerDirector engineer = new EngineerDirector(nyBenz);
		engineer.constructInsurance();
		Insurance insurance = engineer.returnInstance();
		System.out.println("Insurance is created \n" + insurance);
	}

}
