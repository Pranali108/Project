package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Org {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
	@OneToMany
	private List<Employee> empsEmployees;
	public Org() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Employee> getEmpsEmployees() {
		return empsEmployees;
	}
	public void setEmpsEmployees(List<Employee> empsEmployees) {
		this.empsEmployees = empsEmployees;
	}
	@Override
	public String toString() {
		return "Org [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	


}
