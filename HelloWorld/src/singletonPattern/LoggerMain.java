package singletonPattern;

public class LoggerMain {

	public static void main(String[] args) {
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		
		System.out.println(logger1.hashCode());
		System.out.println(logger2.hashCode());

	}

}
