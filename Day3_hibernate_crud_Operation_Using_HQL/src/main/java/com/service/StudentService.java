package com.service;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	public void insertData(Student s) {
		
		StudentDao dao = new StudentDao();
		dao.insertData(s);
		
	}
	
}
