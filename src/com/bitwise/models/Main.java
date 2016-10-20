package com.bitwise.models;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setMobileNo(90);
		Student stu = new Student();
		stu.setName("akanksha");
		studentDetail.setStudent(stu);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(studentDetail);
		session.save(stu);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		

	}

}
