package singletonPattern;

public class BasicSingleton {
	//Make the constructor private
	private BasicSingleton() {	
	}
	//make a non accessible static instance for the class
	private static BasicSingleton bs1 = new BasicSingleton();
	//method to return the above object
	public static BasicSingleton getInstance() {
		return bs1;
	}
	
	private int value=0;
	public int getValue() {
		return value;
	}
	public void setValue(int i) {
		this.value = i;
	}
}
