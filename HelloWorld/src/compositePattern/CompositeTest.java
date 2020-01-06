package compositePattern;

public class CompositeTest {

	public static void main(String[] args) {
		Employee developer1 = new Developer("Nisha",15);
		Employee developer2 = new Developer("Henry",12);
		
		Employee manager1 = new Manager("Robert",30);
		manager1.add(developer1);
		manager1.add(developer2);
		
		Employee director = new Manager("Vishal",100);
		Employee developer3 = new Developer("Sandeep",10);
		director.add(developer3);
		director.add(manager1);
		
		
		System.out.println("Manager Hierarchy");
		manager1.print();
		
		System.out.println("Director Hierarchy");
		director.print();

	}

}
