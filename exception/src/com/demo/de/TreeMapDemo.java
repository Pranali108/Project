package com.demo.de;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Pranali", "Pune", 45000);
		Employee e2 = new Employee(102, "Pooja", "kolhapur", 35000);
		Employee e3 = new Employee(103, "Riya", "Sangli", 50000);
		Employee e4 = new Employee(104, "Priya", "pune",45000);
		Employee e5 = new Employee(105, "Shruti", "pune", 56000);
		
		TreeMap<Integer, Employee> t1 = new TreeMap<>();
		t1.put(1, e1);
		t1.put(2, e2);
		t1.put(3, e3);
		t1.put(4, e4);
		t1.put(5, e5);
		System.out.println(t1);
	}
}
