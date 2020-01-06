package abstraction;

public class MainClass {

	public static void main(String[] args) {
		Dog pamerian = new Dog("Tommy");
		pamerian.eat();
		pamerian.breathe();
		System.out.println(pamerian.getName());
		
		Parrot parrot = new Parrot("Mithu");
		parrot.eat();
		parrot.breathe();
		parrot.fly();
		System.out.println(parrot.getName());
		
		Dodo dodo = new Dodo("DodoDear");
		dodo.eat();
		dodo.breathe();
		dodo.fly();
		
		Animal aDog = new Dog("Shoo");
		aDog.eat();
		aDog.breathe();

	}

}
