package inversionControl;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	
	BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes batting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
