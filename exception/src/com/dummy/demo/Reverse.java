package com.dummy.demo;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.next();
		String reverse = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			reverse = reverse + s.charAt(i);
			
		}
		System.out.println("Reversed String is: ");
		System.out.println(reverse);
		
	}
}
