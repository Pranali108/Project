package com.demo.entity;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {

	public static EntityManagerFactory data()
	{
		EntityManagerFactory eManagerFactory=Persistence.createEntityManagerFactory("mysqldb");
		return eManagerFactory;
	}
}
