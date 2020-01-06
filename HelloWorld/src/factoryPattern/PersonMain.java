package factoryPattern;

public class PersonMain {
	static public void main(String...args) {
		PersonFactory pf1 = new PersonFactory();
		Person person = pf1.createPerson("Henry");
		System.out.println(person.name + "" + person.id);
		PersonFactory pf2 = new PersonFactory();
		Person person2 = pf1.createPerson("Henry");
		System.out.println(person2.name + "" + person2.id);
	}
}
