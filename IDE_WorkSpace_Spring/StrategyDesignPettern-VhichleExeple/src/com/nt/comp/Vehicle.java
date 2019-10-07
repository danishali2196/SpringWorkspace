package com.nt.comp;

public final class Vehicle {
	private Engine eng;

	public void setEng(Engine eng) {
		this.eng=eng;
	}
	
	public void journery(String source,String dest) {
		eng.start();
		System.out.println("vehicle is moving");
		eng.stop();
		System.out.println(source+" to "+dest+" journey is completed");
		
	}

}
