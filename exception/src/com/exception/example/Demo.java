package com.exception.example;

public class Demo {

	public static void main(String[] args) {
		int[] a= new int[6];
	try {	
		String string = null;
		System.out.println(string.charAt(0));
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		//a[6]=70;
				
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		//System.out.println(a[6]);
	    }
		catch (Exception e) { //catch block handle all kind of exception in application
			// TODO: handle exception // handle any kind of exception it is generic catch block
			System.out.println("Error in code");
		}
	}
}
