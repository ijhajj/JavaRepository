package statePattern;

public class MeetingMain {

	public static void main(String[] args) {
		StateContext context = new StateContext();
		context.IsMeetingOn("Room 101");
		
		context.setState(new StateLive());
		context.IsMeetingOn("Room 101");
	}

}
