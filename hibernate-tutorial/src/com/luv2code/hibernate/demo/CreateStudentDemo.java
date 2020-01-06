package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		//Create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//Create Session
		Session session = factory.getCurrentSession();
		System.out.println("Connection setup");
		try {
			//Create Student object
			Student student = new Student("Henry","Begitt","Henry@begitt.com");
			//start a transaction
			System.out.println("Setting up transfer");
			session.beginTransaction();
			//save the student object
			System.out.println("Save ");
			session.save(student);
			//commit the transaction
			System.out.println("Commit");
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}

	}

}
