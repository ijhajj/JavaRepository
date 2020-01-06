package inversionControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//First Bean
		Coach theCoach = context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.toString());
		//Second Bean
		Coach theSecondCoach = context.getBean("myCoach",Coach.class);
		System.out.println(theSecondCoach);
		System.out.println(theCoach==theSecondCoach);
		//Both point to the same object
		//after changing scope to prototype will be pointing to two separate objects
		context.close();

	}

}
