package adapterPattern;

// This needs to look just like the client system - thus implements the Client interface
public class ClientVendorAdapter implements Client{
	//but inside it should use the Vendor methods
	Vendor vendor;
	
	//Implement the interface via constructor
	public ClientVendorAdapter(Vendor vendor) {
		this.vendor = vendor;
	}
	
	@Override
	public String connectToFileSystem(String CustomerID) {
		//Client System is simply supplying the CustomerID, so rest of the fields need to be populated from a configuration file
		String connectionString = "Connect to OracleDB";
		vendor.connectToDB(connectionString, CustomerID);
		return vendor.PrintAge();
		
	}

}
