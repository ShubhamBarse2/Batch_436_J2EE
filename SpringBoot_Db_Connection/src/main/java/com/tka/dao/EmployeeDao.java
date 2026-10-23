package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entities.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Employee e) {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(e);

		tx.commit();
		session.close();

		return "inserted ... !";

	}

	public String deleteData(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

//		Employee e = session.get(Employee.class, id);
		Employee e = session.find(Employee.class, id);

		session.remove(e);

		tx.commit();
		session.close();

		return "deleted ... !";
	}

	public Employee getSingleData(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		String hqlQuery = "from Employee where id=:id";

		Query query = session.createQuery(hqlQuery);
		query.setParameter("id", id);

		Employee e = (Employee) query.getSingleResult();

		tx.commit();
		session.close();

		return e;
	}

	public List<Employee> getAllRecord() {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		String hqlQuery = "from Employee";

		Query query = session.createQuery(hqlQuery);

		List<Employee> list = query.getResultList();

		tx.commit();
		session.close();

		return list;

	}

	public String updateData(Employee e, int id) {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Employee emp = session.find(Employee.class, id);
		emp.setDept(e.getDept());
		emp.setName(e.getName());
		emp.setSalary(e.getSalary());

		session.merge(emp);

		tx.commit();
		session.close();

		return "updated ... !";

	}

}
