package com.nt.bike;

public class Bikes {
	
	private String regNo;
	private String model;
	private String color;
	private String vendor;
	private String bikeNo;
	private String ownerName;
	private long engineNo;
	private String engineCC;
	private int idelSpeed;
	
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setEngineNo(long engineNo) {
		this.engineNo = engineNo;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public void setIdelSpeed(int idelSpeed) {
		this.idelSpeed = idelSpeed;
	}
	
	
	
	@Override
	public String toString() {
		return "Bikes [regNo=" + regNo + ", model=" + model + ", color=" + color + ", vendor=" + vendor + ", bikeNo="
				+ bikeNo + ", ownerName=" + ownerName + ", engineNo=" + engineNo + ", engineCC=" + engineCC
				+ ", idelSpeed=" + idelSpeed + "]";
	}
	
	
	

}
