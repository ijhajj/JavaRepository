package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		//Create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//Create Session
		Session session = factory.getCurrentSession();
		
		try {
			//Create Student object
			Student student = new Student("Henry","Begitt","Henry@begitt.com");
			Student student1 = new Student("John","Fool","John@Fool.com");
			Student student2 = new Student("Picki","Snepett","Picki@Snepett.com");
			//start a transaction
			
			session.beginTransaction();
			//save the student object
			
			session.save(student);
			session.save(student1);
			session.save(student2);
			//commit the transaction
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}

	}

}
