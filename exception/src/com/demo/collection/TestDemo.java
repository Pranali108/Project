package com.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
public static void main(String[] args) {
	List<Product> l1 = new ArrayList<>();
	Category c1 = new Category();
	c1.setCid(1);
	c1.setCname("Electronics");
	
	Product p1 = new Product();
	p1.setPid(101);
	p1.setPnameString("Mobile");
	p1.setPrice(134542);
	p1.setCategory(c1);
	
	Category c2 = new Category(2, "Cosmatics");
	Product p2 = new Product(102, "body lotion", 500, c2);
	l1.add(p1);
	l1.add(p2);
	System.out.println(l1);
	
	
}
}
