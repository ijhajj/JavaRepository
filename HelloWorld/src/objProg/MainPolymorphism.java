package objProg;

public class MainPolymorphism {

	public static void main(String[] args) {
		for(int i = 1; i<10; i++) {
			Movie movie = randomMovie();
			//Polymorphism : functionality is invoked based on the type of Object created
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot : " + movie.plot() + "\n");
			
		}

	}
	public static Movie randomMovie() {
		int randomNumber = (int)(Math.random()*5)+1;
		System.out.println("Random number generated is " + randomNumber);
		switch(randomNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new IndependenceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();
		default:
			return null;
		}
	}

}

class Movie {
	private String name;
	
	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No plot Here";
	}
	public String getName() {
		return this.name;
	}
}

class Jaws extends Movie{
	public Jaws() {
		super("Jaws");
	}
	@Override
	public String plot() {
		return "A Shark eats lot many people";
	}
}

class IndependenceDay extends Movie{
	public IndependenceDay() {
		super("IndependenceDay");
	}
	@Override
	public String plot() {
		return "Aliens attack Human Kind";
	}
}

class MazeRunner extends Movie{
	public MazeRunner() {
		super("MazeRunner");
	}
	@Override
	public String plot() {
		return "Kids try to run out of a Maze";
	}
}

class StarWars extends Movie{
	public StarWars() {
		super("Star Wars");
	}
	@Override
	public String plot() {
		return "Imperial forces try to take over the universe";
	}
}

class Forgetable extends Movie{
	public Forgetable() {
		super("Forgetable");
	}
	//No plot method overrridden
}