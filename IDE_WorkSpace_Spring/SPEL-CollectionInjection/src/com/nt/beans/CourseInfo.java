package com.nt.beans;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class CourseInfo {
	
	private String domain;
	private String institute;
	private List<String> courses;
	private String[] faculties;
	private Map<String,Integer> durations;
	private Map<String,Integer> price;
	private int discount;
	
	

}
