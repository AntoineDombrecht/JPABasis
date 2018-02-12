package com.efrei;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rent implements Serializable{
	private int idRent;
	private String beginDate;
	private String endDate;
	
	private Person p;
	private Vehicle v;
	
	public Rent(){
		
	}
	
	public Rent( int id, Person p, Vehicle v, String string, String string2){
		idRent = id;
		this.beginDate=string;
		this.endDate=string2;
		this.p= p;
		this.v=v;
	}
	
	@Id
	public int getIdRent() {
		return idRent;
	}

	public void setIdRent(int idRent) {
		this.idRent = idRent;
	}

	public String getBeginDate() {
		return beginDate;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@ManyToOne(cascade=CascadeType.PERSIST)
	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public void setBegindate(String begin) {
		this.beginDate = begin;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String end) {
		this.endDate = end;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beginDate == null) ? 0 : beginDate.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + idRent;
				return result;
	}

	

	
}
