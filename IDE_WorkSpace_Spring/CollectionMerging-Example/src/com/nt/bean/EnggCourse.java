package com.nt.bean;

import java.util.Set;

public class EnggCourse {
	
	private Set<String> subjects;
	public void setSubjects(Set<String> subject) {
	this.subjects=subject;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "EnggCourse [subjects=" + subjects + "]";
	}
	


}
