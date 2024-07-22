package com.arraylist.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id = s1.nextInt();
		System.out.println("Enter Employee name");
		String name = s1.next();
		System.out.println("Enter Employee city");
		String city = s1.next();
		System.out.println("Enter Employee salary");
		float salary = s1.nextFloat();
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setCity(city);
		e1.setSalary(salary);
		List<Employee> l1 = new ArrayList<>();
		l1.add(e1);
		System.out.println(l1);
	}
}
