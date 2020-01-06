package statePattern;

public class StateContext {
	Meeting currentState;//Interface Meeting property instance
	
	public StateContext() {
		currentState = new StateOffLine();//This is the default state - set when constructor is called
	}
	
	public void setState(Meeting newState) {
		this.currentState = newState; //This is to change the state at later stage
	}
	
	public void IsMeetingOn(String room) {
		currentState.IsMeetingOn(this, room);
	}
}
