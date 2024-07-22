package com.demo.collection;

public class Product{

	private int pid;
	private String pnameString;
	private float price;
	private Category category;
	
	
	public Product(int pid, String pnameString, float price, Category category) {
		super();
		this.pid = pid;
		this.pnameString = pnameString;
		this.price = price;
		this.category = category;
	}
	public Product(){
		super();
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPnameString() {
		return pnameString;
	}
	public void setPnameString(String pnameString) {
		this.pnameString = pnameString;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pnameString=" + pnameString + ", price=" + price + ", category=" + category
				+ "]";
	}
	
	
	 
}
