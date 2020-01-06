package inversionControl;

import java.util.Random;

public class HappyFortuneService implements FortuneService{
	private static String[] fortuneArray = {"You are lucky today","Your luck is NOT shining today","Draw!!"};
	private int index=0;
	
	HappyFortuneService(){
		Random rand = new Random();
		this.index = rand.nextInt(3);
	}
	@Override
	public String getFortune() {
		return this.fortuneArray[this.index];
	}

}
