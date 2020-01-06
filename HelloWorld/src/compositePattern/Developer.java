package compositePattern;

//Developer has been identified as a leaf
public class Developer implements Employee{
	private String name;
	private int salary;
	
	public Developer(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		//This is a leaf node, so no implementation
		
	}

	@Override
	public void remove(Employee employee) {
		//This is a leaf node, so no implementation
		
	}

	@Override
	public Employee getChild(int i) {
		//This is a leaf node, so no implementation
		return null;
	}

	@Override
	public void print() {
		System.out.println(" Developer Name : " + name + " Salary : " + salary);
		
	}

}
