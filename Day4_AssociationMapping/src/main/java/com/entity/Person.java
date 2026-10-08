package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int person_Id;
	String name;
	String city;

	@OneToOne()
	@JoinColumn(name = "LID")
	Laptop lappi;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int person_Id, String name, String city, Laptop lappi) {
		super();
		this.person_Id = person_Id;
		this.name = name;
		this.city = city;
		this.lappi = lappi;
	}

	public int getPerson_Id() {
		return person_Id;
	}

	public void setPerson_Id(int person_Id) {
		this.person_Id = person_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Laptop getLappi() {
		return lappi;
	}

	public void setLappi(Laptop lappi) {
		this.lappi = lappi;
	}

	@Override
	public String toString() {
		return "Person [person_Id=" + person_Id + ", name=" + name + ", city=" + city + ", lappi=" + lappi + "]";
	}

}
