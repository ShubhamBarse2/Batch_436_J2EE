package com.controller;

import java.util.Scanner;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) {

		StudentService ss = new StudentService();

		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter ur id ");
//		int id = sc.nextInt();

//		sc.nextLine();
		System.out.println("Enter ur Name ");
		String name = sc.nextLine();
		System.out.println("Enter ur age ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter ur city ");
		String city = sc.nextLine();
		System.out.println("Enter ur Gender ");
		String gender = sc.nextLine();

		Student s = new Student(name, city, age, gender);

		ss.insertData(s);

	}
}
