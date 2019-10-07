package com.nt.test;

import java.util.Scanner;

import com.nt.comp.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Vehicle vehicle=null;
		String engg=null,source=null,dest=null;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Engine");
		engg=scn.nextLine();
		System.out.println("Enter Source");
		source=scn.nextLine();
		System.out.println("enter destination");
		dest=scn.nextLine();
				
		
		vehicle=VehicleFactory.getIntance(engg);
		vehicle.journery(source, dest);

	}

}
