package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			
			int StudentID = 1;
			Student studentDetails = session.get(Student.class, StudentID);
			studentDetails.setFirstName("Libra");
			//bulk update
			session.createQuery("update Student set email='abc@xyz.com'")
					.executeUpdate();
			session.getTransaction().commit();
		}finally{
			factory.close();
		}
								

	}

}
