package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetSingleRecord {

	public static void main(String[] args) {

//		db Connection code 

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 126;
		Student s = ss.get(Student.class, id);

		s.setName("ravi");
		s.setAge(20);
		s.setCity("pune");

//		ss.update(s);
		ss.merge(s);

//		Student stud = new Student();

		tr.commit();
		ss.close();

		System.out.println("updated ...! ");
	}
}
