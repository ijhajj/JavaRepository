package statePattern;

public class StateLive implements Meeting{
	
	@Override
	public void IsMeetingOn(StateContext context, String room) {
		System.out.println("Enter Meeting in " + room);
		
	}

}
