package com.nt.beans;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Student {
	
	private int regNo;
	private String name;
	private List<String> availedCourses;
	private String[] faculties;
	private Map<String,Integer> availedCourseDuration;
	private int courseFeeTotal;
	private int totalDuration;
	private int totalFee;
	

}
