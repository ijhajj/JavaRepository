package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;


public class CreateCourseAndStudentsDemo {

	public static void main(String[] args) {
		//Create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory();
		//Create Session
		Session session = factory.getCurrentSession();
		System.out.println("Connection setup");
		try {
	
			
	//start a transaction
			session.beginTransaction();
			
			Course tempCourse = new Course("Biology");
			
			tempCourse.addReview(new Review("Good Course"));
			tempCourse.addReview(new Review("Full Course"));
			tempCourse.addReview(new Review("Not So Good Course"));
			tempCourse.addReview(new Review("Ignore Course"));
			
			session.save(tempCourse);
		
	//commit the transaction
			System.out.println("Commit");
			session.getTransaction().commit();
		}
		finally {
			session.close();
			factory.close();
		}

	}

}
