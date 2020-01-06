package objProg;

public class StaticIntitializationBlock {
	public static final String owner;
	//Static initialization block gets called before the constructor
	static {
		owner = "IP";
		System.out.println("Static Initialization Block invoked");
	}
	public StaticIntitializationBlock() {
		System.out.println("Constructor called");
	}
	static {
		System.out.println("Second Static Initialization Block Invoked");
	}
	public void someMethod() {
		System.out.println("Some Method defined");
	}
}
