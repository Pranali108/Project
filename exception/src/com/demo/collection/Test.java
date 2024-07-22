package com.demo.collection;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		Collection c1 = new ArrayList<>();
		System.out.println("Size of collection is: "+c1.size());
		c1.add(10);
		c1.add(12.33f);
		c1.add("pune");
		c1.add(true);
		c1.add("pune"); //we can add duplicate elements
		c1.remove("pune");
		
		
		System.out.println("Size of collection is: "+c1.size());
		System.out.println(c1);
		
		Collection c2 = new ArrayList<>();
		System.out.println("Collection c2");
		System.out.println(c2);
		c2.addAll(c1);
		System.out.println(c2);
		
		List l = new ArrayList<>();
		System.out.println("Size of list is: "+l.size());
		l.add(20);
		l.add(true);
		System.out.println("Size of list is: "+l.size());
		System.out.println(l);
		
		ArrayList a = new ArrayList<>();
		System.out.println("Size of Arraylist is: "+a.size());
		a.add(32);
		a.add("pune");
		System.out.println("Size of Arraylist is: "+a.size());
		System.out.println(a);
		
		List l1  = new ArrayList<>();
		AbstractList a1 = new ArrayList<>();
		ArrayList a2 = new ArrayList<>();
	}
}
