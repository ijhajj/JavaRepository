package prototypePattern;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee IP = new Employee("IP",new Address("123 London","London","UK"));
		Employee Andy = new Employee(IP);
		Andy.empName = "Andy";
		System.out.println(IP);
		System.out.println(Andy);
		//IP.empAddress = new Address("We are back","Dhaula","India");
		System.out.println(IP);
		System.out.println(Andy);
	}

}
