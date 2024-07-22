package com.demo.collection;

public class Employee {

	private int id;
	private String nameString;
	private String cityString;
	private float salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String nameString, String cityString, float salary) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.cityString = cityString;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNameString() {
		return nameString;
	}


	public void setNameString(String nameString) {
		this.nameString = nameString;
	}


	public String getCityString() {
		return cityString;
	}


	public void setCityString(String cityString) {
		this.cityString = cityString;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
