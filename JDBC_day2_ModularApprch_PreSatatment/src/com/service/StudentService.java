package com.service;

import com.dao.StudentDao;

public class StudentService {

	public void insertData() throws Exception {
		StudentDao dao = new StudentDao();
		dao.insertData();
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
