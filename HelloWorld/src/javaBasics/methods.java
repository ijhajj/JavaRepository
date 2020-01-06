package javaBasics;

public class methods {

	public static void main(String[] args) {
		boolean gameover = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameover, score, levelCompleted, bonus);
		System.out.println("Your Final Score is : " + highScore);
		
		score = 1000;
		levelCompleted = 8;
		bonus = 200;
		highScore = calculateScore(gameover, score, levelCompleted, bonus);
		System.out.println("Your Final Score is : " + highScore);
		
		//highScore = calculateScore(gameover, 1500, levelCompleted, bonus);
		int position = calculateHighScorePosition(1500);
		displayHighScorePosition("Henry",position);
		//highScore = calculateScore(gameover, 900, levelCompleted, bonus);
		position = calculateHighScorePosition(900);
		displayHighScorePosition("Queer",position);
		//highScore = calculateScore(gameover, 400, levelCompleted, bonus);
		position = calculateHighScorePosition(400);
		displayHighScorePosition("Patric",position);
		//highScore = calculateScore(gameover, 50, levelCompleted, bonus);
		position = calculateHighScorePosition(50);
		displayHighScorePosition("Almond",position);
		
	}
	
	public static int calculateScore(boolean gameover, int score, int levelCompleted, int bonus) {
		
		if (gameover) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
		}
		return -1;
	}
	
	public static void displayHighScorePosition(String name,int position) {
		System.out.println(name + " managed to get into position " + position + " on the High Score Table");
	}
	
	public static int calculateHighScorePosition(int score) {
		if (score>=1000){
			return 1;
		}else if (score>=500){
			return 2;
		}else if (score>100) {
			return 3;
		}
			return 4;
		
	}

}
