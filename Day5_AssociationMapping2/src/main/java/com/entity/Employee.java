package com.entity;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

@Entity
public class Employee { // MANY

	@Id
	private int empId;
	private String empName;

	@ColumnDefault(value = "'pune'")
	private String city = "pune";

	@Check(constraints = "age >= 24 AND age <= 120")
	private int age;

	@ManyToOne
//	@JoinColumn(name = "dddd")
	Department dept;

	@Transient
	private String exp;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String city, int age, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.age = age;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", age=" + age + ", dept="
				+ dept + "]";
	}

}
