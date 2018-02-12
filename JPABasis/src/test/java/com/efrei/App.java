package com.efrei;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		Person p = new Person(2, "Mounia");
		Vehicle v = new Vehicle("123-456");
		Rent r = new Rent(2, p, v, "16-12-1993", "14-12-2017");
		
		entityManager.persist(r);


		tx.commit();
    }
}
