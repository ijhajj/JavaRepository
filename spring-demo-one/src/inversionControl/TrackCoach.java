package inversionControl;

public class TrackCoach implements Coach {
	FortuneService fortuneService;
	
	TrackCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Track is unlucky for you today";
	}
	//add init method : invoked when bean is instantiated
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach bean created!!!");
	}
	//add destroy method : invoked when bean is destroyed
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach bean getting destroyed!!!");
	}
}
