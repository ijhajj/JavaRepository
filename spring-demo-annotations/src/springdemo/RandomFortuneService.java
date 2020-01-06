package springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	//create array of Strings
	private String[] data = {"Good Luck","Bad Luck","Rewarding Day"};
	
	//Random generator
	Random rand = new Random();
	
	@Override
	public String getFortune() {
		int index = rand.nextInt(3);
		return data[index];
	}

}
