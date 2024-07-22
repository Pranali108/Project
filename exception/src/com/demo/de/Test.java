package com.demo.de;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		//TreeSet<Employee> t1  = new TreeSet(new EmployeeComp());
		TreeSet<Employee> t1  = new TreeSet(new Address());
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
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);
	}
}
