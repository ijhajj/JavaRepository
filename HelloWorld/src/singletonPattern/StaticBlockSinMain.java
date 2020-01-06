package singletonPattern;

public class StaticBlockSinMain {

	public static void main(String[] args) {
		StaticBlockSingleton SSObj = StaticBlockSingleton.getInstance();
		System.out.println(SSObj);

	}

}
