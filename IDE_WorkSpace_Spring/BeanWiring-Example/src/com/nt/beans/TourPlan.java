package com.nt.beans;

import java.util.Arrays;

public class TourPlan {

	private String[] places;

	//setter method
	public void setPlaces(String[] places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "TourPlan [places=" + Arrays.toString(places) + "]";
	}
	
	
	
}
