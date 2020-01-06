package adapterPattern;

public interface Vendor {
	public void connectToDB(String connectionString,String customerID);
	public String PrintAge();
}
