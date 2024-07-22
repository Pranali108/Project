package com.demo.de;

import java.util.HashSet;


public class HashSetDemo {

	public static void main(String[] args) { 
		HashSet h1 = new HashSet<>();
		h1.add("pune");
		h1.add(10); // 10%4 = value store in hash table
		h1.add(50);
		h1.add(30);
		h1.add(70);
		h1.add(40);
		h1.add(20);
		System.out.println(h1);
	
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Pranali");
		e1.setCity("Pune");
		e1.setSalary(50000.33f);
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("Pooja");
		e2.setCity("Kolhapur");
		e2.setSalary(45000.33f);
		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("Riya");
		e3.setCity("sangli");
		e3.setSalary(35000.33f);
		Employee e4 = new Employee();
		e4.setId(101);
		e4.setName("Priya");
		e4.setCity("Hyd");
		e4.setSalary(40000.33f);
		HashSet<Employee> h2 = new HashSet<>();
		h2.add(e1);
		h2.add(e2);
		h2.add(e3);
		h2.add(e4);
		System.out.println(e2);
	}
}
