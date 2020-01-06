package springdemo;

import org.springframework.beans.factory.annotation.Value;

public class GulidandaCoach implements Coach {
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Its our rural sport";
	}



	public String getEmail() {
		return email;
	}



	public String getTeam() {
		return team;
	}

	
}
