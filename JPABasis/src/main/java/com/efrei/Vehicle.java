package com.efrei;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vehicle implements Serializable {
	private String plateNumber;
	private List<Rent> liste;

	public Vehicle(){
//		plateNumber = "00-AAA-00";
		liste = new ArrayList<Rent>();
	}
	public Vehicle(String plateNumber){
		this.plateNumber = plateNumber;
		liste = new ArrayList<Rent>();
	}
	
	@Id
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	
	@OneToMany(mappedBy="v")
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
		result = prime * result
				+ ((plateNumber == null) ? 0 : plateNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (plateNumber == null) {
			if (other.plateNumber != null)
				return false;
		} else if (!plateNumber.equals(other.plateNumber))
			return false;
		return true;
	}
	
	
	
}
