package com.sbi.demo;

import javax.management.loading.PrivateClassLoader;
import javax.print.event.PrintJobAttributeEvent;

public class Address {

	private int flatNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(int flatNo, String area, String city, String state, String country, int pincode) {
		super();
		this.flatNo = flatNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}


	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
