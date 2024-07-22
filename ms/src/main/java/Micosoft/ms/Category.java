package Micosoft.ms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String desc1;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int id, String name, String desc1) {
		super();
		this.id = id;
		this.name = name;
		this.desc1 = desc1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc1;
	}
	public void setDesc(String desc) {
		this.desc1 = desc1;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", desc1=" + desc1 + "]";
	}
}
