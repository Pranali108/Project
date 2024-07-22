package com.demo.entity;

import javax.persistence.EntityManager;

public class Test {

	public static void main(String[] args) {
		EntityManager eManager=DbConnection.data().createEntityManager();
		eManager.getTransaction().begin();
		Subject s1=new Subject();
		s1.setsName("Java");
		s1.setUnit("8");
		eManager.persist(s1);
		Teacher t1 = new Teacher();
		t1.setName("joe");
		t1.setSalary(12345);
		t1.setDept("IT");
		t1.setSubjects(s1);
		eManager.persist(t1);
		eManager.getTransaction().commit();
		eManager.close();
		System.out.println("Data Inserted");
			
	}
}
