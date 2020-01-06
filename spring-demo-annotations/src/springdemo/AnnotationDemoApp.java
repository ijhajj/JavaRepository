package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		Coach tennisCoach = context.getBean("theTennisCoach",Coach.class);
		//get the bean created by default
		BasketballCoach basketballCoach = context.getBean("basketballCoach",BasketballCoach.class);
		
		//Dependency Injection using setters
		FootballCoach footballCoach = context.getBean("footballCoach",FootballCoach.class);
		
		//Dependency Injection using fields
		HockeyCoach hockeyCoach = context.getBean("hockeyCoach",HockeyCoach.class);
		
		//Using values from property file
		SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//call the method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(basketballCoach.getDailyWorkout());
		System.out.println(basketballCoach.getFortuneService());
		
		System.out.println(footballCoach.getDailyWorkout());
		System.out.println(footballCoach.getFortuneService());
		
		System.out.println(hockeyCoach.getDailyWorkout());
		System.out.println(hockeyCoach.getFortuneService());
		
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getEmailID());
		System.out.println(swimCoach.getTeam());
		//close the context
		context.close();
	}

}
