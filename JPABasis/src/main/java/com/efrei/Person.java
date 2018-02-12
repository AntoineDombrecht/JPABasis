package com.efrei;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;


@Entity
public class Person implements Serializable {

	int id;
	String name;
	private List<Rent> liste;

	
	
	public Person() {

		liste = new ArrayList<Rent>();

	}
	
	public Person(int id, String name){
		this.id=id;
		this.name=name;
		liste = new ArrayList<Rent>();

	}
	
	@Id
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
	
	
	
	@OneToMany(mappedBy="p", cascade=CascadeType.PERSIST)
	public List<Rent> getListe() {
		return liste;
	}

	public void setListe(List<Rent> liste) {
		this.liste = liste;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	public boolean equals(Person p) {
		 return this.id == p.id;
	}

	public static void main(String [] a){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		Person p = new Person();
		entityManager.persist(p);
	}
	
	
}
