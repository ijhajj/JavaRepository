package bridgePattern;

public abstract class Department {
	protected Employee employee; //instance of Employee interface
	
	public Department(Employee employee) {
		this.employee = employee;
	}
	
	abstract public void assignEmployee();

}
