package adapterPattern;

public class ClientMain {

	public static void main(String[] args) {
		//Client System uses some hardcoded text file
		Client client = new ClientSystem();
		client.connectToFileSystem("100987");
		
		//Vendor System uses a DB which is better than the other
		Vendor vendor = new VendorSystem();
		vendor.connectToDB("OracleDB", "100987");
		vendor.PrintAge();
		
		//ClientVendorAdapter usage
		ClientVendorAdapter CVAdapt = new ClientVendorAdapter(vendor);
		CVAdapt.connectToFileSystem("100987");

	}

}
