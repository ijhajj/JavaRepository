package singletonPattern;

public class BasicSinMain {

	public static void main(String[] args) {
		BasicSingleton bsObj = BasicSingleton.getInstance();
		bsObj.setValue(100);
		System.out.println(bsObj.getValue());
		BasicSingleton bsObj2 = BasicSingleton.getInstance();
		System.out.println(bsObj2.getValue());
	}

}
