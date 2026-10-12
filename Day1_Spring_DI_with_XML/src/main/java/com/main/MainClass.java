package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Country;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee emp = context.getBean("emp", Employee.class);
//		Country con = context.getBean("con", Country.class);

//		System.out.println(con);
		System.out.println(emp);

	}

}
