package bridgePattern;

public class LongForm extends Views{
	public LongForm(Resource R) {
		super(R);
	}
	public String show() {
		String str = "LongForm";
		System.out.println("LongForm Views method invoked");
		return str;
	}
}
