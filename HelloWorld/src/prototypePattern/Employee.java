package prototypePattern;

public class Employee {
	String empName;
	Address empAddress;
	
	public Employee(String empName, Address empAddress) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	//copy constructor
	public Employee(Employee other) {
		this.empName = other.empName;
		//this.empAddress = new Address(other.empAddress);//invokes the copy constructor of Address class
		this.empAddress = other.empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
}
