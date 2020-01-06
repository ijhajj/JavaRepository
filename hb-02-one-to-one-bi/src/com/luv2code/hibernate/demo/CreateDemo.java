package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {

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
	//Create Instructor Object
			Instructor instructorObj = new Instructor("MAdhu","Patel");
			
	//Create Instructor Detail Object
			InstructorDetail instructorDetailObj = new InstructorDetail("http://www.madhupatel.com/youtube","sticthing");
			
	//associate the objects
			instructorObj.setInstructorDetail(instructorDetailObj);
			
	//start a transaction
			session.beginTransaction();
			
	//save the instructor object --> will inherently save the instructor detail object as well
	//because of CASCADE.ALL
			session.save(instructorObj);
		
	
	//commit the transaction
			System.out.println("Commit");
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}

	}

}
