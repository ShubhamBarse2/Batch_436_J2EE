package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	int laptopId;
	@Column(name = "lappi_Name", nullable = false, unique = true, length = 100)
	String l_name;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int laptopId, String l_name) {
		super();
		this.laptopId = laptopId;
		this.l_name = l_name;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", l_name=" + l_name + "]";
	}

}
