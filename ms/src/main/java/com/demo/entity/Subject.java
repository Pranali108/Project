package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scode;
	private String sName;
	private String unit;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int scode, String sName, String unit) {
		super();
		this.scode = scode;
		this.sName = sName;
		this.unit = unit;
	}
	public int getScode() {
		return scode;
	}
	public void setScode(int scode) {
		this.scode = scode;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "Subject [scode=" + scode + ", sName=" + sName + ", unit=" + unit + "]";
	}
	
	
}
