package com.arraylist.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Test {

	public static void main(String[] args) {
		List<String> l1= new ArrayList<>();
		l1.add("Priya");
		l1.add("Pooja");
		l1.add("Siya");
		l1.add("Riya");
		l1.add("Joe");
		l1.add("Smith");
		System.out.println(l1);
		Collections.sort(l1);
		Collections.reverse(l1);
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		System.out.println(l1.get(0));
		System.out.println(l1.contains("Pooja"));
		System.out.println(l1.size());
		l1.set(0, "Delhi");
	}
}
