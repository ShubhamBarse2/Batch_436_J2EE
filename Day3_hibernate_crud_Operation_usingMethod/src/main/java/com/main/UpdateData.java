package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class UpdateData {

	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "update Student set name=:name , city=:city  where id =: id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		int id = 1;
		query.setParameter("id", id);
		query.setParameter("name", "prakash");
		query.setParameter("city", "mumbai");
		query.executeUpdate();

		System.out.println("Updated ...!");

		tr.commit();
		ss.close();
	}
}
