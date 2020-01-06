package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		//Student student1 = new Student("Duck","scooby","ducky@scubby.com");
		
		List<Student> stdList;
		
		try {
			session.beginTransaction();
			Student student1 = session.get(Student.class, 1);
			//Fetching more than one Student
			stdList = session.createQuery("from Student").list();
			
			displayStudent(stdList);
			
			stdList = session.createQuery("from Student s where s.lastName='Begitt'").list();
			displayStudent(stdList);
			
			System.out.println("Checking OR clause");
			stdList = session.createQuery("from Student s where s.lastName='Fool' or s.firstName='Henry'").list();
			displayStudent(stdList);
			
			System.out.println("Like Clause");
			stdList = session.createQuery("from Student s where s.lastName like 'Fo%'").list();
			displayStudent(stdList);
			
			System.out.println(student1);
		}finally {
			session.close();
		}
		

	}

	private static void displayStudent(List<Student> stdList) {
		for(Student tempStudent: stdList) {
			System.out.println(tempStudent);
		}
	}

}
