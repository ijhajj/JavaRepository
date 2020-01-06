package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach1 = context.getBean("theTennisCoach",Coach.class);
		Coach tennisCoach2 = context.getBean("theTennisCoach",Coach.class);
		
		System.out.println(tennisCoach1==tennisCoach2);
		
		context.close();

	}

}
