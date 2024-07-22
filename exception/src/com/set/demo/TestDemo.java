package com.set.demo;

import java.util.Set;
import java.util.TreeSet;

public class TestDemo {

	public static void main(String[] args) {
		Set s1 = new TreeSet();
		s1.add(123);
		s1.add(444);
		s1.add("Pune");
		System.out.println(s1);
	}
}
