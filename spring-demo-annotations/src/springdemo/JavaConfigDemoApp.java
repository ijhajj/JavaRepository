package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config Java file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);//Config class we created
		
		
		//get bean from spring container
		Coach tennisCoach = context.getBean("theTennisCoach",Coach.class);
		BandmintonCoach bandmintonCoach = context.getBean("bandmintonCoach",BandmintonCoach.class);
		GulidandaCoach guliCoach = context.getBean("gulidandaCoach",GulidandaCoach.class);
		
		//call the method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(bandmintonCoach.getDailyWorkout());
		System.out.println(bandmintonCoach.getFortuneService());
		System.out.println(guliCoach.getEmail());
		System.out.println(guliCoach.getTeam());
		
		//close the context
		context.close();
	}

}
