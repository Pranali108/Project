package Micosoft.ms;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main( String[] args )
    {
    	EntityManagerFactory eManagerFactory =Persistence.createEntityManagerFactory("mysqldb");
    	EntityManager em = eManagerFactory.createEntityManager();
		em.getTransaction().begin();
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter product name: ");
		String name=s1.next();
		
		System.out.println("Enter product price: ");
		float price = s1.nextFloat(); 
		Product p1 = new Product();
		//p1.setId(id);
		p1.setName(name);
		p1.setPrice(price);
		em.persist(p1);
		
		em.getTransaction().commit();
		eManagerFactory.close();
		em.close();
        System.out.println( "Hello World!" );
    }
}
