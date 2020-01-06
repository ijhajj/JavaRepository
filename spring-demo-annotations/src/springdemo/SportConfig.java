package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springdemo")//package name
public class SportConfig {
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach theSwimCoach = new SwimCoach();
		return theSwimCoach;
	}
	//Define bean for bandmintonCoach and inject dependency
	@Bean
	public Coach bandmintonCoach() {
		return new BandmintonCoach(sadFortuneService());
	}
}
