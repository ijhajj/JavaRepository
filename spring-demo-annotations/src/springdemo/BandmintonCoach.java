package springdemo;

public class BandmintonCoach implements Coach {
	private FortuneService fortuneService;
	
	BandmintonCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Paly Bandminton";
	}
	
	public String getFortuneService() {
		return this.fortuneService.getFortune();
	}
}
