package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class GetInstructorDetailDemo {

	public static void main(String[] args) {
		//Create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		//Create Session
		Session session = factory.getCurrentSession();
		System.out.println("Connection setup");
		try {
	//start a transaction
			session.beginTransaction();
			
	// get the Instructor detail object
			InstructorDetail instructorDetail = session.get(InstructorDetail.class,21);
			
	// print the instructor detail
			System.out.println(instructorDetail);
	// print the associated instructor
			System.out.println(instructorDetail.getInstructor());
	//commit the transaction
			System.out.println("Commit");
			session.getTransaction().commit();
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}

	}

}
