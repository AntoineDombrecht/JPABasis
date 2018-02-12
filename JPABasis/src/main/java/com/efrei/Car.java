package com.efrei;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicle{

	private int numberOfSeat;
	
	public Car (){}
	
	public Car (int x){
		super();
		numberOfSeat = x;
	}
	
	
	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}
	
	
}
