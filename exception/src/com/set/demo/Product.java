package com.set.demo;

public class Product implements Comparable<Product>{

	
	
	private int id;
	private String nameString;
	private float price;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String nameString, float price) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", nameString=" + nameString + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(id>o.id)
		{
			return 1;
		}
		if(id<o.id)
		{
			return -1;
			
		}
		else {
			return 0;
		}
	}
}
