package abstraction;

public abstract class Bird extends Animal implements CanFly{
	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println("Bird is eating");
		
	}

	@Override
	public void breathe() {
		System.out.println("Bird is breathing");
		
	}
	
	@Override
	public void fly() {
		System.out.println(this.getName() + "is flapping its wings");
	}
	
	

}
