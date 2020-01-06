package statePattern;

public class StateOffLine implements Meeting{
	
	@Override
	public void IsMeetingOn(StateContext context, String room) {
		System.out.println("Meeting not started in " + room);
		
	}

}
