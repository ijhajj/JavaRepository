package inversionControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//First Bean
		Coach theCoach = context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.toString());	
		context.close();

	}

}
