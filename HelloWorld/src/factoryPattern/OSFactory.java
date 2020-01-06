package factoryPattern;

public class OSFactory {

	public OS getInstance(String str) {
		if (str=="open") {
			return new Android();
		}else if(str=="closed") {
			return new IOS();
		}
		return new Windows();
	}
}
