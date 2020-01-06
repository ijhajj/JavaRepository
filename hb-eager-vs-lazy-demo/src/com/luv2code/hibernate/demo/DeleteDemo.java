package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class DeleteDemo {

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
			
	//get instructor by id
			Instructor instructor = session.get(Instructor.class, 1);
			
	//delete that instructor
			session.delete(instructor);
	
	//commit the transaction
			System.out.println("Commit");
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}

	}

}
