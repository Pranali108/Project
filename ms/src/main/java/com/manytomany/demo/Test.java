package com.manytomany.demo;


import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;

import com.demo.entity.DbConnection;

public class Test {

	public static void main(String[] args) {
		EntityManager eManager=DbConnection.data().createEntityManager();
		eManager.getTransaction().begin();
	
		Patient p1 = new Patient();
		p1.setName("joe");
		p1.setCity("Pune");
		p1.setDoctors(null);
		
		Patient p2 = new Patient();
		p2.setName("Pooja");
		p2.setCity("Delhi");
		p2.setDoctors(null);
		
		Patient p3 = new Patient();
		p3.setName("Siya");
		p3.setCity("Hyd");
		p3.setDoctors(null);
		
		eManager.persist(p1);
		eManager.persist(p2);
		eManager.persist(p3);
		Set<Patient> pp = new TreeSet<>();
		pp.add(p1);
		pp.add(p3);
		
		Set<Patient> pp1 = new TreeSet<>();
		pp1.add(p2);
		pp1.add(p3);
		pp1.add(p1);
		
		Set<Patient> pp2 = new TreeSet<>();
		pp2.add(p1);
		pp2.add(p3);
		
		Doctor d1 = new Doctor();
		d1.setName("abc");
		d1.setDept("Cardiology");
		d1.setHospitalname("XYZ");
		d1.setPatientserSet(pp);
		
		Doctor d2 = new Doctor();
		d2.setName("def");
		d2.setDept("Cardiology");
		d2.setHospitalname("PQR");
		d2.setPatientserSet(pp1);
		
		Doctor d3 = new Doctor();
		d3.setName("ghi");
		d3.setDept("Cardiology");
		d3.setHospitalname("ABC");
		d3.setPatientserSet(pp);
		
		eManager.persist(d1);
		eManager.persist(d2);
		eManager.persist(d3);
		
		eManager.getTransaction().commit();
		eManager.close();
		
	}
}
