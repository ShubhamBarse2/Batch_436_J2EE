package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentDao {

	public void insertData(Student std) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();
//		s.setId(std.getId());
		s.setName(std.getName());
		s.setAge(std.getAge());
		s.setCity(std.getCity());
		s.setGender(std.getGender());

		ss.persist(s); // it is for Insertion
//        ss.save(s);  // it is for Insertion 

		tr.commit();
		ss.close();

		System.out.println("Inserted ...! ");
	}
}
