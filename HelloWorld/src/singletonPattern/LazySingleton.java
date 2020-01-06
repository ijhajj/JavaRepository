package singletonPattern;

public class LazySingleton {
	private LazySingleton() {}
	private static LazySingleton LSObj;
	
	public static LazySingleton getInstance() {
		if (LSObj == null) {
			LSObj = new LazySingleton();
		}
		return LSObj;
	}

}
