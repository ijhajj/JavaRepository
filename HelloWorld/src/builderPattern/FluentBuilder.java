package builderPattern;

//FluentBuilder with recursive generics : extending one builder into another builder
public class FluentBuilder {

	public static void main(String[] args) {
		EmployeeBuilder pb = new EmployeeBuilder();
		Person IP = 
		pb.withName("IP")
			.worksAt("Infy")
			.build();
		System.out.println(IP);

	}

}
