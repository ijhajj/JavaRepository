package singletonPattern;

public class LazySinThreadSafe {
	public static LazySinThreadSafe LSTSObj;
	private LazySinThreadSafe() {}
	//Added Synchronized keyword
	public static synchronized LazySinThreadSafe getInstance() {
		if (LSTSObj==null) {
			LSTSObj = new LazySinThreadSafe();
		}
		return LSTSObj;
	}
}
