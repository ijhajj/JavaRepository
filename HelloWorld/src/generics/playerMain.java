package generics;

public class playerMain {

	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer patt = new BaseballPlayer("Patt");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		
		//Team adelCrows = new Team("Adel Crows");
		Team<FootballPlayer> adelCrows = new Team("Adel Crows");
		adelCrows.addPlayer(joe);
		//compiler starts complaining cause below players do not belong to Football type of Object now
		//adelCrows.addPlayer(patt);
		//adelCrows.addPlayer(beckham);
		
		System.out.println(adelCrows.numPlayers());
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago gorillas");
		baseballTeam.addPlayer(patt);
		
		//still below wont give any compiler errors 
		//Team<String> stringTeam = new Team<>("String Team having no Player class");
		//stringTeam.addPlayer("Henry");
		
		//This is taken care by modifying the declaration of the class Team which specifically states to consider objects extending class Player
		// And now above is being complained by compiler
		//thus, now we can go back to Team class and remove the "Player" type casting added earlier
		Team<FootballPlayer> hawthron = new Team<>("HawThron");
		Team<FootballPlayer> freemental = new Team<>("Free Mental");
		
		hawthron.matchResult(freemental, 1, 0);
		hawthron.matchResult(adelCrows,3,8);
		
		adelCrows.matchResult(freemental, 2, 1);
		//adelCrows.matchResult(baseballTeam,1,1);
		System.out.println(adelCrows.getName() + " : " + adelCrows.ranking());
		
		System.out.println(adelCrows.compareTo(hawthron));
		
	}

}
