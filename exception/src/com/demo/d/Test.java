package com.demo.d;

public class Test {

	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.data();
		
		try {
			throw new Employee();
		} catch (Employee e) {
			// TODO: handle exception
			e.data();
		}
	}
}
