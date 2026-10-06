package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {

	public static void main(String[] args) {

//		db Connection code 

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int idd = 124;

		Student s = ss.get(Student.class, idd);

		ss.delete(s);
//		ss.remove(s);

		tr.commit();
		ss.close();

		System.out.println("Deleted ...! ");
	}
}
