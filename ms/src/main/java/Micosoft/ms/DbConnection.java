package Micosoft.ms;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {

	public static EntityManagerFactory data()
	{
		EntityManagerFactory eFactory = Persistence.createEntityManagerFactory("mysqldb");
		return eFactory;
	}
}
