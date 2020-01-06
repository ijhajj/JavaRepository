package dataStructures;

public class MainClass {

	public static void main(String[] args) {
		ITelephone IPPhone = new DeskPhone(123456);
		IPPhone.powerOn();
		IPPhone.callPhone(123456);
		
		//MobilePhone Class
		ITelephone IPMobile = new MobilePhone(88234568);
		//IPMobile.powerOn();
		IPMobile.callPhone(8823456);
		
		System.out.println("***********");
		//Another way to create those objects
		DeskPhone dPhone = new DeskPhone(1234);
		dPhone.answer();
		
		MobilePhone mPhone = new MobilePhone(1234);
		mPhone.answer();
	}

}
