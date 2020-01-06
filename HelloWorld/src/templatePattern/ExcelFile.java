package templatePattern;

public class ExcelFile extends FileTemplate{
	//abstract methods defined
	public void readData() {
		System.out.println("Reads from Excel");
	}
	public void processData() {
		System.out.println("Process Excel Data");
	}
	//Already defined in parent class
/*	public void saveData() {
		System.out.println("Save Data to Database");
	}*/
}
