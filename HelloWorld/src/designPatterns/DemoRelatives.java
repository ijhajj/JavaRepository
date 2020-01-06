package designPatterns;
public class DemoRelatives {

	public static void main(String[] args) {
		Person john = new Person("John");
		Person child1 = new Person("Ria");
		Person child2 = new Person("Aarav");
		
		Relationships rel1 = new Relationships();
		rel1.addParentAndChild(john, child1);
		rel1.addParentAndChild(john, child2);
		
		Research research1 = new Research(rel1);

	}

}
