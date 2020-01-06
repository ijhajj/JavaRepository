package singletonPattern;
import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {
	private static StaticBlockSingleton SSObj;
	
	private StaticBlockSingleton() throws IOException{}
	
	static {
		try {
			SSObj = new StaticBlockSingleton();
		}catch(Exception e) {
			System.err.println("failed to create singleton");
		}
	}
	public static StaticBlockSingleton getInstance() {
		return SSObj;
	}
	
}
