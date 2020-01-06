package builderPattern;

public class PhoneBuilder {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	public String getOs() {
		return os;
	}
	public PhoneBuilder os(String os) {
		this.os = os;
		return this;
	}
	
	public PhoneBuilder ram(int ram) {
		this.ram = ram;
		return this;
	}
	
	public PhoneBuilder processor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public PhoneBuilder screenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	public PhoneBuilder battery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os,ram,processor,screenSize,battery);
	}
	

}
