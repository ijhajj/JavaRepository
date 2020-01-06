package springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("theTennisCoach")
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand";
	}
	@PostConstruct
	void atCreation() {
		System.out.println("At the time of creation!!!");
	}
	@PreDestroy
	void atDestruction() {
		System.out.println("At the time of Destruction!!!");
	}
}
