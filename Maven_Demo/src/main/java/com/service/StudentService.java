package com.service;

import com.dao.StudentDao;
import com.pojo.Student;

public class StudentService {

	public void insertData(Student std) throws Exception {
		StudentDao dao = new StudentDao();
		dao.insertData(std);
	}

	public void updateData() throws Exception {
		StudentDao dao = new StudentDao();
		dao.updateData();
	}

	public void deleteData() throws Exception {
		StudentDao dao = new StudentDao();
		dao.deleteData();
	}

	public void fetchData() throws Exception {
		StudentDao dao = new StudentDao();
		dao.fetchData();

	}

	public void deletetable() throws Exception {
		StudentDao dao = new StudentDao();
		dao.deleteTable();

	}

}
