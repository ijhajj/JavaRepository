package bridgePattern;

public class Sales extends Department{

	public Sales(Employee employee) {
		super(employee);
	}

	@Override
	public void assignEmployee() {
		System.out.println("Sales Dept assigned: ");
		employee.empType();
	}
}
