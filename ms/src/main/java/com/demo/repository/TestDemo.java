package com.demo.repository;

import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		while(true)
		{
			System.out.println("Employee Mgnt Service");
			System.out.println("1.Add Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Display Employee");
			System.out.println("Enter Your Choice");
			int x = s1.nextInt();
			switch(x) {
			
			case 1: {
				CategoryService c1  =  new CategoryService();
				c1.add();
				System.out.println("Data inserted");
			}
			
			case 2: {
				CategoryService c2  =  new CategoryService();
				c2.update();
				System.out.println("Data updated");
			}
			
			case 3: {
				CategoryService c3  =  new CategoryService();
				c3.delete();
				System.out.println("Data deleted");
			}
			
			case 4: {
				CategoryService c4  =  new CategoryService();
				c4.display();
				System.out.println("Display Data");
			}
			
			
			}
		}
	}
}
