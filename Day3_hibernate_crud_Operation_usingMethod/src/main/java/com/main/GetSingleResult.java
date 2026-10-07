package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

public class GetSingleResult {

	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Student where id =: id";

		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		int id = 2;
		query.setParameter("myid", id);

		Student std = query.getSingleResult();

		System.out.println(std);

		tr.commit();
		ss.close();
	}
}
