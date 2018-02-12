package com.efrei;

import javax.persistence.Entity;

@Entity
public class Van  extends Vehicle{
	private int weightMax;

	public Van (){}
	
	public Van(int weightMax) {
		super();
		this.weightMax = weightMax;
	}

	public int getWeightMax() {
		return weightMax;
	}

	public void setWeightMax(int weightMax) {
		this.weightMax = weightMax;
	}
	
}
