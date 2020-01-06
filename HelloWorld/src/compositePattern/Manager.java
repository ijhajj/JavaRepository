package compositePattern;
import java.util.List;
import java.util.ArrayList;

//Manager is identified as composite
public class Manager implements Employee{
	private String name;
	private int salary;
	
	//Manager will have a list of employees under him
	List<Employee> empList = new ArrayList<>();
	
	public Manager(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		empList.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		empList.remove(employee);
	}

	@Override
	public Employee getChild(int i) {
		return empList.get(i);
	}

	@Override
	public void print() {
		System.out.println("Manager Name : " + name + " Salary : " + salary);
		for (Employee employee:empList) {
			employee.print();
		}
	}
	
	

}
