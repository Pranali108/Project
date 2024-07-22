package com.dummy.demo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int[] arr = new int[5];
		int x = arr.length;
		System.out.println("Array Operation");
		System.out.println("Enter Array Elements");
		for(int i=0; i<x; i++)
		{
			arr[i] = s1.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0; i<x; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
