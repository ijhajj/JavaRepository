package prototypePattern;

import java.io.Serializable;

public class Foo implements Serializable {
	private int firstAttribute;
	private String secondAttribute;
	
	public Foo(int firstAttribute, String secondAttribute) {
		super();
		this.firstAttribute = firstAttribute;
		this.secondAttribute = secondAttribute;
	}

	@Override
	public String toString() {
		return "Foo [firstAttribute=" + firstAttribute + ", secondAttribute=" + secondAttribute + "]";
	}
	
	
}
