package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
private FortuneService fortuneService;
	@Autowired
	BasketballCoach(@Qualifier("happyFortuneService")FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice shooting the Hoops";
	}
	public String getFortuneService() {
		return this.fortuneService.getFortune();
	}

}
