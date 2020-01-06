package singletonPattern;

public class Logger {
	//create the Logger object here
	//as static methods can only access static instances, make it static as well
	private static Logger logger;
	//make constructor private
	private Logger() {}
	//provide a public method to return the object
	//make it static, so it can be accessed without instantiating the class
	public static Logger getInstance() {
		if(logger==null) {
			logger = new Logger();
		}
		return logger;
	}
}
