package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Freehit practice for half an hour";
	}
	public String getFortuneService() {
		return fortuneService.getFortune();
	}
}
