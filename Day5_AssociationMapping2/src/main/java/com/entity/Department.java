package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department { // ONE

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String deptName;

	@OneToMany
//	@OneToMany(mappedBy = "dept") // ref of another one 
	List<Employee> emp;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String deptName, List<Employee> emp) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.emp = emp;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", emp=" + emp + "]";
	}

}
