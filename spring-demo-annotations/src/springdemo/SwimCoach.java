package springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	@Value("${foo.email}")
	private String emailID;
	
	@Value("${foo.team}")
	private String team;
	
	@Override
	public String getDailyWorkout() {
		return null;
	}

	public String getEmailID() {
		return emailID;
	}

	public String getTeam() {
		return team;
	}

	
}
