package objProg;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	private int cylinders;
	
	//Setters allow us to initialize the attributes plus control the way they are initialized
	public void setModel(String model) {
		String validModels = model.toLowerCase();
		if (validModels.equals("carrera") || validModels.equals("commodore")) {
		this.model = model;
	}else {
		this.model="Unknown";
	}
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public String getModel() {
		return this.model;
	}
}
