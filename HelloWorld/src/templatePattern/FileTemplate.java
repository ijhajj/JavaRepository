package templatePattern;

//Contains abstract methods thus declared as abstract
public abstract class FileTemplate {
	//Method providing the algorithm/template for any subclass to process
	public void dataProcessing() {
		readData();
		processData();
		saveData();
	}
	//Below methods need to be defined by subclasses - thus abstract
	public abstract void readData();
	public abstract void processData();
	
	//Below method is common to all the subclasses, thus, declared and defined in parent class itself
	public void saveData() {
		System.out.println("Save Data to Database");
	}
}


