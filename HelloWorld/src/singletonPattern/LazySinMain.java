package singletonPattern;

public class LazySinMain {

	public static void main(String[] args) {
		LazySingleton LSObj=null;
		System.out.println(LSObj);
		System.out.println(LSObj.getInstance());
	}

}
