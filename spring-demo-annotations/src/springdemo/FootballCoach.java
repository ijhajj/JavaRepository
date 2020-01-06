package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("databaseFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Running for 20 minutes";
	}

	public String getFortuneService() {
		return "There is dew, not a good day for a match";
	}
	@Autowired
	@Qualifier("happyFortuneService")
	public void doAdditionalStuff(FortuneService fortuneService) {
		System.out.println("Inside Additional Stuff");
	}
}
