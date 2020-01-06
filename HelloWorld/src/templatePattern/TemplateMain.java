package templatePattern;

public class TemplateMain {
	public static void main(String args[]) {
		System.out.println("*****Excel File*****");
		//ExcelFile exFile = new ExcelFile();
		FileTemplate exFile = new ExcelFile();
		//exFile.readData();
		//exFile.processData();
		//exFile.saveData();
		exFile.dataProcessing();
		
		System.out.println("******Text File ******");
		//TextFile txtFile = new TextFile();
		FileTemplate txtFile = new TextFile();
		//txtFile.readData();
		//txtFile.processData();
		//txtFile.saveData();
		txtFile.dataProcessing();
	}
}
