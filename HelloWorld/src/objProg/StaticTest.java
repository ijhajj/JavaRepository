package objProg;

public class StaticTest {
	private int numInstance = 0;
	//to achieve the behaviour we wanted for the above instance, we need to be make is global at class level
	private static int numberOfInstances = 0;
	private String name;
	
	public StaticTest(String name) {
		numInstance ++;
		numberOfInstances++;
		this.name = name;
	}
	
	public int getNumInstance() {
		return numInstance;
	}
	
	public String getName() {
		return name;
	}
	public int getNumberOfInstances() {
		return numberOfInstances;
	}
	//static method can be accessed by class name
	public static int getNumIns() {
		return numberOfInstances;
	}
}
