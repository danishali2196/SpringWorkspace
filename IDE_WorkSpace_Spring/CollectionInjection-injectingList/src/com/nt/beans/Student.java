package com.nt.beans;

import java.util.Arrays;
import java.util.List;

public class Student {
	
	private int marks[];
	private List<String> name;
	
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + ", name=" + name + "]";
	}
	
	

}
