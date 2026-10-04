package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {

//		db Connection code 

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();
		s.setId(124);
		s.setName("praful");
		s.setAge(32);
		s.setCity("nsk");

		ss.persist(s); // it is for Insertion
//        ss.save(s);  // it is for Insertion 

		tr.commit();
		ss.close();

		System.out.println("Inserted ...! ");
	}
}
