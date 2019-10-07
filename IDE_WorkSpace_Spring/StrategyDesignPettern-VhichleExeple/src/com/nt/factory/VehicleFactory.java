package com.nt.factory;

import com.nt.comp.CNGEngine;
import com.nt.comp.DieselEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Vehicle;

public class VehicleFactory {
	
	public static Vehicle getIntance(String engType) {
		Vehicle vehicle=null;
		Engine eng=null;
		
		if (engType.equalsIgnoreCase("diesel")) {
			eng=new DieselEngine();
			
		}
		else if (engType.equalsIgnoreCase("petrol")) {
			eng=new PetrolEngine();
			
			
		}
		else if (engType.equalsIgnoreCase("cng")) {
			eng=new CNGEngine();
			
		}
		
		else {
			throw new IllegalArgumentException("eng not valid");
		}
		
		vehicle=new Vehicle();
		vehicle.setEng(eng);
		return vehicle;
		
		
	}

}
