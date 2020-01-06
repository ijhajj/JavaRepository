package hibernate.activity.eight;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		
		try {
			session.beginTransaction();
			//Creation of Data for Employee table
	/*		Employee employee1 = new Employee("Way","My","MyWayCompany");
			Employee employee2 = new Employee("Henry","skuted","hdhenu");
			Employee employee3 = new Employee("Sungte","Jeuhae","jeusge");
			Employee employee4 = new Employee("Jhsyar","dhjst","dusge");
			Employee employee5 = new Employee("Thisje","tatsr","keise");
			session.save(employee5);
			session.getTransaction().commit();
			
	//		session.beginTransaction();
			System.out.println("PRINTING ALL EMPLOYEE DETAILS");
			//Read data of all the employees
			//allEmps = session.createQuery("from Employee").list();
			displayEmployeeDetails(session);
			
			//Read data for only one Employee
			System.out.println("PRINTING ONLY FOR EMPLOYEE 1");
			Employee emp = session.get(Employee.class,1);
			System.out.println(emp);
			//session.getTransaction().commit();
			
			//Update Employee 1 details
			//session.beginTransaction();
			emp = session.get(Employee.class, 1);
			emp.setFirstName("Truthfull");
			session.getTransaction().commit();*/
			
		/*	System.out.println("DISPLAY AFTER UPDATING NAME FOR EMPLOYEE 1");
			session.beginTransaction();
			//allEmps = session.createQuery("from Employee").list();
			displayEmployeeDetails(session);
			session.getTransaction().commit();*/
			
			//Update Company Name for all the Employees
	//		session.beginTransaction();
	//		session.createQuery("update Employee set company='New Company'")
	//				.executeUpdate();
	//		session.getTransaction().commit();
			
			System.out.println("DISPLAY AFTER UPDATING COMPANY FOR EVERY EMPLOYEE");
		//	session.beginTransaction();
			displayEmployeeDetails(session);
			session.getTransaction().commit();
		
			
		}finally {
			factory.close();
		}
	}

	private static void displayEmployeeDetails(Session session) {
		List<Employee> allEmps;
		allEmps = session.createQuery("from Employee").list();
		for (Employee emp:allEmps) {
			System.out.println(emp);
		}
	}

}
