
package com.nt.beans;

public class Engine {
	private int engNo;
	private String type;
	public void setEngNo(int engNo) {
		this.engNo = engNo;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [engNo=" + engNo + ", type=" + type + "]";
	}
	

}
