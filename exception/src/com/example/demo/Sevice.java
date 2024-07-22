package com.example.demo;

import java.util.Scanner;

public  class Sevice extends Demo{

			
	Demo d1 = new Sevice();
	Demo d2 = new Sevice();
			
		
		@Override
		public void setData() {
			// TODO Auto-generated method stub
			Scanner s1 = new Scanner(System.in);
			
			System.out.println("enter id");
			int id = s1.nextInt();
			
			System.out.println("enter name");
			String name = s1.next();
			
			System.out.println("enter percentage");
			float percentage = s1.nextFloat();
			
			d1.setId(id);
			d1.setName(name);
			d1.setPercentage(percentage);
			
		}
		@Override
		public void getData() {
			// TODO Auto-generated method stub
			System.out.println("Id is: "+d2.getId());
			System.out.println("name is: "+d2.getName());
			System.out.println("Percentage is: "+d2.getPercentage());
		}
		
		
		
		
	

	
	
	
}
