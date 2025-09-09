package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		SessionFactory sessionFactory = context.getBean(SessionFactory.class);
	
		Student stu = context.getBean(Student.class);
		
		Session session = sessionFactory.openSession();
		session.save(stu);
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		
	}
}
