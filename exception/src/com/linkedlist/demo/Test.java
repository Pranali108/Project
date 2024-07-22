package com.linkedlist.demo;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList<>();
		
		
		
		l1.add(222);
		l1.add(7563);
		l1.add(999);
		l1.add(654);
		l1.addFirst(10);
		l1.add(555);
		l1.addLast(102);
		l1.add(333);
		System.out.println(l1);
		//Methods in the linked list
		l1.add(0, 120);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);

		}
}
