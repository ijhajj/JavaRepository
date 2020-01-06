package templatePattern;

public class TextFile extends FileTemplate{
	//abstract methods defined
	public void readData() {
		System.out.println("Reads from Text");
	}
	public void processData() {
		System.out.println("Process Text Data");
	}
	//Defined in parent
/*	public void saveData() {
		System.out.println("Save Data to Database");
	}*/
}
