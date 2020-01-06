package inversionControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach baseballCoach = context.getBean("myBaseballCoach",Coach.class);
		Coach hockeyCoach = context.getBean("myHockeyCoach",Coach.class);
		//call methods on beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(hockeyCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyFortune());
		System.out.println(theCoach.getDailyFortune());
		
		
		CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailId());
		System.out.println(cricketCoach.getTeam());
		//close the context
		context.close();
	}

}
