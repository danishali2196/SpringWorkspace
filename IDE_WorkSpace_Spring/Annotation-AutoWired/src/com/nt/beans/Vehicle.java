package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {
	
									//Using field
	//@Autowired
	private Engine eng;

									//Using Constructor
//	@Autowired
//	public Vehicle(Engine eng) {
//		this.eng = eng;
//	}
	
								//using Setter Method
		@Autowired(required=true)
		@Qualifier("p")
		public void setEng(Engine eng) {
		this.eng= eng ;
	}
	
	
							//Using Custom Method Level
//	@Autowired
//	public void assign(Engine eng) {
//		this.eng=eng;
//	}
	
	
	@Override
	public String toString() {
		return "Vehicle [eng=" + eng + "]";
	}
	
	
	
	
	

}
