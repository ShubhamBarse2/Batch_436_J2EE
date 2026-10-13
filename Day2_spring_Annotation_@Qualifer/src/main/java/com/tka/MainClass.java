package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(myConfigClass.class);
		Person p = context.getBean(Person.class);
		System.out.println(p.getSim1().calling());
		System.out.println(p.getSim2().calling());
	}

}
