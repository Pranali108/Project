package com.demo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList<>();
		System.out.println("Size of collection is: "+a1.size());
		a1.add(10);
		a1.add(12.33f);
		a1.add("pune");
		a1.add(1253);
		a1.add("Delhi");
//		System.out.println(a1);
//		System.out.println(a1.get(2));
		
//		for(int i = 0; i<a1.size(); i++)
//		{
//			System.out.println(a1.get(i));
//		}
		
//		for(Object o1 : a1)
//		{
//			System.out.println(o1);
//		}
		
//		Iterator<Object> i1 = a1.iterator();
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
//		System.out.println("We are at end");
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
		
		ListIterator<Object> l1 = a1.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		System.out.println("End of program");
		
		
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
	}
}
