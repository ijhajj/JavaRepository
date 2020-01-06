package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;


public class CreateCourseAndReviewsDemo {

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
			
			Course tempCourse = new Course("Zoology");
			
			session.save(tempCourse);
			
			Student tempStd1 = new Student("Henry","Begitt","Henry.Begitt@xyz.com");
			Student tempStd2 = new Student("hjsenry","Begitt","dghsd.Begitt@xyz.com");
			Student tempStd3 = new Student("shjdhjs","Begitt","dshjd.Begitt@xyz.com");
			Student tempStd4 = new Student("dhjsdhjsd","Begitt","ajakah.Begitt@xyz.com");
			
			tempCourse.addStudent(tempStd1);
			tempCourse.addStudent(tempStd2);
			tempCourse.addStudent(tempStd3);
			tempCourse.addStudent(tempStd4);
			
			session.save(tempStd1);
			session.save(tempStd2);
			session.save(tempStd3);
			session.save(tempStd4);
			
			System.out.println("Saved Student :" + tempCourse.getStudents());
		
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
