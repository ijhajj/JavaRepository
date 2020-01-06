package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class FetchJoinDemo {

	public static void main(String[] args) {
		//Create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		//Create Session
		Session session = factory.getCurrentSession();
		System.out.println("************** Connection setup *****************");
		try {
	//start a transaction
			session.beginTransaction();
			
			int instructorID = 1;
			
			//Create Query
			Query<Instructor> query = session.createQuery("select i from Instructor i " + 
									"JOIN FETCH i.courses " +
									"where i.id=:theInstructorId",
									Instructor.class);
			//set parameters on that query
			query.setParameter("theInstructorId", instructorID);
			
			//execute query and get instructor
			Instructor instructor = query.getSingleResult();
			
			System.out.println("*********** Instructor ************ : " + instructor);
			

	
	//commit the transaction
			System.out.println("************* Commit ***************");
			session.getTransaction().commit();
	//close session
			session.close();
			System.out.println("*********** Courses ************ :" + instructor.getCourses());
		}
		finally {
			session.close();
			factory.close();
		}

	}

}
