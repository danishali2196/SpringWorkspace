package com.nt.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import com.nt.external.ScoreComp;
import com.nt.external.ScoreCompImpl;

public class ScoreCompServiceLocator{
	private static Map<String,ScoreComp> cache=new HashMap<String,ScoreComp>();
	
	public ScoreComp getService() {
	if (!cache.containsKey("icc")) {
		cache.put("icc",new ScoreCompImpl());
	}
	
	return cache.get("icc");
	}
}


