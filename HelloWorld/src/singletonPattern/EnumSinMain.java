package singletonPattern;

public class EnumSinMain{
	public static void main(String... args) {
		EnumSingleton e1 = EnumSingleton.INSTANCE;
		System.out.println(e1.getValue());
		e1.setValue(111);
		System.out.println(e1.getValue());
	}

}
