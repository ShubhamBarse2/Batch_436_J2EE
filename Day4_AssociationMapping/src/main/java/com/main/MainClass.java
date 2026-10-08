package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Laptop;
import com.entity.Person;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(Laptop.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Laptop l = new Laptop();
		l.setLaptopId(1001);
		l.setL_name("ASUS");

//		Person p = new Person();
//		p.setName("shyam");
//		p.setCity("pune");
//		p.setLappi(l);

		ss.persist(l);
//		ss.persist(p);

		System.out.println("Inserted ...!");

		tr.commit();
		ss.close();
	}
}
