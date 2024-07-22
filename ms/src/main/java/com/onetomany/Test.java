package com.onetomany;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

import com.demo.entity.DbConnection;


public class Test {

	public static void main(String[] args) {
		EntityManager eManager=DbConnection.data().createEntityManager();
		eManager.getTransaction().begin();
		Employee e1 = new Employee();
		e1.setName("Pooja");
		e1.setDept("IT");
		e1.setSalary(54322);
		Employee e2 = new Employee();
		e2.setName("Pranali");
		e2.setDept("CS");
		e2.setSalary(65432);
		
		eManager.persist(e2);
		List<Employee> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		
		Org o1 = new Org();
		o1.setName("Coditas");
		o1.setLocation("Pune");
		o1.setEmpsEmployees(l1);
		eManager.persist(o1);
		eManager.getTransaction();
		eManager.close();
		System.out.println("Welcome to one to many");
	}
}
