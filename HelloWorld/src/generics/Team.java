package generics;
import java.util.ArrayList;

//At run time - T would be replaced with the actual Object type its invoked with
//public class Team<T> {
public class Team<T extends Player> implements Comparable<Team<T>>{
	private String teamName;
	int played=0,tied=0, won=0, lost=0;
	
	private ArrayList<T> playerList = new ArrayList<>();
	
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
	public String getName() {
		return this.teamName;
	}
	
	public boolean addPlayer(T player) {
		if(playerList.contains(player)) {
			//Type case to the generic class
			//System.out.println(((Player) player).getName() + " is already in the team");
			System.out.println(player.getName() + " is already in the team");
			return false;
		}else {
			playerList.add(player);
			//System.out.println(((Player)player).getName() + " picked for the team" + this.getName());
			System.out.println(player.getName() + " picked for the team" + this.getName());
			return true;
		}
	}
	public int numPlayers() {
		return playerList.size();
	}
	
	public void matchResult(Team<T> opponentTeam,int ourScore, int theirScore) {
		if(ourScore>theirScore) {
			won++;
			System.out.println("We won!");
		}else if(ourScore < theirScore) {
			lost++;
			System.out.println("We lost!");
		}else {
			tied++;
			System.out.println("Match is a tie!");
		}
		//below code saves the results for the opponent team instance as well
		if(opponentTeam!=null) {
			opponentTeam.matchResult(null, theirScore, ourScore);
		}
	}
	public int ranking() {
		return (won*2)+tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		if (this.ranking() > team.ranking()) {
			return -1;
		}else if(this.ranking()<team.ranking()) {
			return 1;
		}
		return 0;
	}
	
	

}
