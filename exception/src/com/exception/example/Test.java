//try and catch 


package com.exception.example;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		
		try {
		int a = sc.nextInt();
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		System.out.println("Addition is: "+add);
		System.out.println("Substraction is: "+sub);
		System.out.println("Multiplication is: "+mul);
		System.out.println("Division is: "+div);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter proper data");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Second number should not be zero");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in code");
		}
	}
}
