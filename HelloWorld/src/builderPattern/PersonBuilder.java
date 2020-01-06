package builderPattern;

//Specify that PersonBuilder can take a type argument, but that argument needs to be some inheritor of type PersonBuilder
public class PersonBuilder <SELF extends PersonBuilder<SELF>>{
	protected Person person = new Person();
	
	public SELF withName(String name) {
		person.name= name;
		return self();
	}
	public Person build() {
		return person;
	}
	//just to override it in subclasses
	protected SELF self() {
		return (SELF) this;
	}
}
