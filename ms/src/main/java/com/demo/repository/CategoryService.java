package com.demo.repository;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Micosoft.ms.Category;
import Micosoft.ms.DbConnection;

public class CategoryService implements CategoryRepository{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		EntityManager eManager = DbConnection.data().createEntityManager();
		eManager.getTransaction().begin();
		Category c1 = new Category();
		c1.setDesc("h");
		c1.setName("abc");
		eManager.persist(c1);
		eManager.getTransaction().commit();
		eManager.close();
		System.out.println("Data Inserted Successfully");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		EntityManager eManager = DbConnection.data().createEntityManager();
		Query q1 = (Query) eManager.createQuery("select c from Category c");
		ArrayList<Category> a1 = (ArrayList<Category>) q1.getResultList();
		System.out.println(a1.toString());
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		EntityManager eManager = DbConnection.data().createEntityManager();
		eManager.getTransaction().begin();
		int id=1;
		Category c1 = eManager.getReference(Category.class, id);
		c1.setName("Pooja");
		c1.setDesc("hello");
		
		eManager.merge(c1);
		eManager.getTransaction().commit();
		eManager.close();
		
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		EntityManager eManager = DbConnection.data().createEntityManager();
		eManager.getTransaction().begin();
		int id=1;
		Category c1 = eManager.getReference(Category.class, id);
		eManager.remove(c1);
		eManager.getTransaction().commit();
	}

}
