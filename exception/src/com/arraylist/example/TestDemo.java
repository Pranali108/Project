package com.arraylist.example;

import java.util.Stack;

public class TestDemo {

	public static void main(String[] args) {
		Stack s1 = new Stack<>();
		System.out.println(s1.isEmpty());
		
		s1.push(100);
		s1.push(45);
		s1.push(674);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		s1.push(254);
		s1.push(22);
		System.out.println(s1.peek());//peek show the top element
	}
}
