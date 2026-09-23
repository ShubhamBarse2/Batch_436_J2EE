package com.controller;

import java.util.Scanner;

import com.pojo.Student;
import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) throws Exception {

		StudentService service = new StudentService();

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter City");
		String city = sc.nextLine();
		
		Student s = new Student(id, name, city);

		service.insertData(s);
//		service.updateData();
//		service.deleteData();
//		service.fetchData();

//		service.deletetable();
	}

}
