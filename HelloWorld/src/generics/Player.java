package generics;

public abstract class Player {
	public String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
