package com.nt.dao;

import java.util.List;

import com.nt.bo.PassengerBO;

public interface PassengerDAO {
	
	public int[] groupReservation(List<PassengerBO> listBO);

}
