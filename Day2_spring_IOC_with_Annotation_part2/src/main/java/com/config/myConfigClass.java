package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.entity.Employee;

//@Configuration
public class myConfigClass {

	@Bean("emp")
	@Scope("prototype")
	public Employee objEmp() {
		return new Employee();

	}
}
