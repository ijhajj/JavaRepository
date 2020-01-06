package bridgePattern;

public class IT extends Department{

	public IT(Employee employee) {
		super(employee);
	}

	@Override
	public void assignEmployee() {
		System.out.println("IT employee assigned : ");
		employee.empType();
		
	}
}
