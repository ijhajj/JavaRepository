package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;


public class GetCourseForStudentDemo {

	public static void main(String[] args) {
		//Create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//Create Session
		Session session = factory.getCurrentSession();
		System.out.println("Connection setup");
		try {
	
			
	//start a transaction
			session.beginTransaction();
			
			int stdId = 1;
			Student student = session.get(Student.class,stdId);
			
			System.out.println(student.getCourses());
			
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
