package adapterPattern;

public class ClientSystem implements Client{

	@Override
	public String connectToFileSystem(String CustomerID) {
		System.out.println("Connects to text file and return age of customer");
		return "34";
	}

}
