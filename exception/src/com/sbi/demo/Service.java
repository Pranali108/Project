package com.sbi.demo;

import java.util.Scanner;

public class Service {

	Address a1 = new Address();
	Employee e1 = new Employee();
	void setData()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter address");
		System.out.println("enter flat number");
		int flatno = s1.nextInt();
		
		System.out.println("enter Area");
		String area = s1.next();
		
		System.out.println("enter city");
		String city = s1.next();
		
		System.out.println("enter state");
		String state = s1.next();
		
		System.out.println("enter country");
		String country = s1.next();
		
		System.out.println("enter pincode");
		int pincode = s1.nextInt();
		
		System.out.println("enter emp id");
		int id = s1.nextInt();
		
		System.out.println("enter emp name");
		String name = s1.next();
		
		System.out.println("enter emp dept");
		String dept = s1.next();
		
		System.out.println("enter emp salary");
		float salary = s1.nextFloat();
		
		a1.setFlatNo(flatno);
		a1.setArea(area);
		a1.setCity(city);
		a1.setState(state);
		a1.setCountry(country);
		a1.setPincode(pincode);
		
		e1.setId(id);
		e1.setName(name);
		e1.setDept(dept);
		e1.setSalary(salary);
		e1.setAddress(a1);
		
	}
	
	void getData()
	{
		System.out.println("FlatNo is: "+a1.getFlatNo());
		System.out.println("Area is: "+a1.getArea());
		System.out.println("City is: "+a1.getCity());
		System.out.println("State is: "+a1.getState());
		System.out.println("Country is: "+a1.getCountry());
		System.out.println("Pincode is: "+a1.getPincode());
		System.out.println("emp Id is: "+e1.getId());
		System.out.println("emp name is: "+e1.getName());
		System.out.println("emp dapt is: "+e1.getDept());
		System.out.println("emp salary is: "+e1.getSalary());
		System.out.println("emp Address is: "+e1.getAddress());
		
	}
}
