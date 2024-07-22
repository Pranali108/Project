package com.set.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class ProductTest {

	public static void main(String[] args) {
		TreeSet<Product> t1 = new TreeSet<>();
		Product p1 = new Product();
		p1.setId(101);
		p1.setNameString("tv");
		p1.setPrice(11234);
		Product p2 = new Product();
		p2.setId(102);
		p2.setNameString("Mobile");
		p2.setPrice(12000);
		Product p3 = new Product();
		p3.setId(103);
		p3.setNameString("Fridge");
		p3.setPrice(16000);
		Product p4 = new Product();
		p4.setId(104);
		p4.setNameString("Laptop");
		p4.setPrice(65000);
		t1.add(p1);
		t1.add(p2);
		t1.add(p3);
		t1.add(p4);
		
		for (Product product : t1)
		{
			System.out.println(product);
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		
		
	//System.out.println(t1);
	}
}
