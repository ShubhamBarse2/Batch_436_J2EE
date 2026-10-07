package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class FetchAllData {

	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Student";

		org.hibernate.query.Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		List<Student> list = query.list();
//		jakarta.persistence.Query query = ss.createQuery(hqlQuery);
//		query.getResultList();
//		query.g
//		List<Student> list = query.getResultList();

		System.out.println(list);

	}
}
