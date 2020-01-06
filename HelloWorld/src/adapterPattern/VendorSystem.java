package adapterPattern;

public class VendorSystem implements Vendor{
	int age;
	@Override
	public void connectToDB(String connectionString, String customerID) {
		System.out.println("Using connection string connect to DB and fetch age of customer and set his age");
		this.age = 40;
		
	}

	@Override
	public String PrintAge() {
		System.out.println("Printing Age : " + age);
		return age + "";
	}

}
