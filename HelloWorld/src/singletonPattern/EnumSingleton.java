package singletonPattern;

public enum EnumSingleton {
	INSTANCE;
	//by default the constructor of an Enum is private
	EnumSingleton(){
		value = 42;
	}
	private int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
