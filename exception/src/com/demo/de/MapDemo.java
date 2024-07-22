package com.demo.de;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map m1 = new TreeMap<>();
		m1.put(2, 1);
		m1.put(1, 2);
		m1.put(4, 3);
		m1.put(3, 4);
		m1.put(5, null);
		System.out.println(m1);
	}
}
