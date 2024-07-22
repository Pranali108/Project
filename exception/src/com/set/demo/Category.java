package com.set.demo;

public class Category {

	private int id;
	private String cname;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
//	@Override
//	public String toString() {
//		return "Category [id=" + id + ", cname=" + cname + "]";
//	}
	
	public int compareTo(Category c) {
		// TODO Auto-generated method stub
		if(id>c.id)
		{
			return 1;
		}
		if(id<c.id)
		{
			return -1;
			
		}
		else {
			return 0;
		}
	}
	
	
	
}
