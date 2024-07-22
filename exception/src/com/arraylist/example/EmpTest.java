package com.arraylist.example;

import java.util.Stack;

public class EmpTest {

	public static void main(String[] args) {
		Stack<Employee> s1 = new Stack<>();
		Employee e1 = new Employee(101, "joe", "Hyd", 123);
		Employee e2 = new Employee(102, "Bob", "Delhi",234);
		Employee e3 = new Employee(103, "Smit", "Pune", 665);
		Employee e4 = new Employee(104, "tim", "Nagpur", 3453);
		s1.push(e1);
		s1.push(e2);
		s1.push(e3);
		s1.push(e4);
		s1.pop();
		for(Employee employee : s1) {
			System.out.println(employee);
		}
				
	}
}
