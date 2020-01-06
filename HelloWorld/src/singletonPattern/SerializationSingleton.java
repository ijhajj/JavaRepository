package singletonPattern;

import java.io.Serializable;

public class SerializationSingleton implements Serializable{
	//make constructor private 
	private SerializationSingleton(){}
	//create one single object
	private static SerializationSingleton SS1 = new SerializationSingleton();
	// method to get the Instance
	public static SerializationSingleton getInstance() {
		return SS1;
	}
	private int value = 0;
	public int getValue() {
		return this.value;
	}
	public void setValue(int val) {
		this.value = val;
	}
	//This informs JVM that whenever serialization happens it has to happen in context to this object
	protected Object readResolve() {
		return SS1;
	}
}

