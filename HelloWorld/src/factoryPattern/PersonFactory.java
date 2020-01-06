package factoryPattern;

public class PersonFactory {
	
	private int id = 0;
	
	public Person createPerson(String name) {
		Person person = new Person(id++,name);
		return person;
	}
}
