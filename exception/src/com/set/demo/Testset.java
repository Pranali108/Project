package com.set.demo;

import java.util.Set;
import java.util.TreeSet;

public class Testset {
public static void main(String[] args) {
	Set s1 = new TreeSet<>(); //Set avoids to add the duplicate data so whenever we not need to add duplicate data then we can use set
	s1.add(10);
	s1.add(50);
	s1.add(90);
	s1.add(20);
	s1.add(90);
	System.out.println(s1);
	Set<String> s2 = new TreeSet<>();
	s2.add("abc");
	s2.add("abc");
	s2.add("ABC");
	s2.add("Abc");
	s2.add("pqr");
	s2.add("xyz");
	
	System.out.println(s2);
}
}
