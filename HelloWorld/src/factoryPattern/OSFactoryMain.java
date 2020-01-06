package factoryPattern;

public class OSFactoryMain {

	public static void main(String[] args) {
		//OS obj = new Android();
		//obj.spec();
		OSFactory factoryObj = new OSFactory();
		OS osObj = factoryObj.getInstance("open");
		osObj.spec();
	}

}
