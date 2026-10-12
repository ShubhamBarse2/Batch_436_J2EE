package com.entity;

public class Country {

	int country_Id;
	String c_name;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int country_Id, String c_name) {
		super();
		this.country_Id = country_Id;
		this.c_name = c_name;
	}

	public int getCountry_Id() {
		return country_Id;
	}

	public void setCountry_Id(int country_Id) {
		this.country_Id = country_Id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	@Override
	public String toString() {
		return "Country [country_Id=" + country_Id + ", c_name=" + c_name + "]";
	}

}
