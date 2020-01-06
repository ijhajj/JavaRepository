package inversionControl;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailId;
	private String team;
	
	
	//Setting dependency using setter
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fielding 20 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
