package dataStructures;

public class DeskPhone implements ITelephone {
	private int myNumber;
	private boolean isRinging;
	
	public DeskPhone(int Number) {
		this.myNumber = Number;
	}
	@Override
	public void powerOn() {
		System.out.println("No power button in DeskPhone");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Dialing " + phoneNumber);
		
	}

	@Override
	public void answer() {
		System.out.println("Answering the DeskPhone");
		isRinging = false;
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber==myNumber) {
			isRinging=true;
			System.out.println("Myphone is Ringing");
		}else {
			isRinging=false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
