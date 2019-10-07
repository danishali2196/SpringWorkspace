package com.nt.external;

public class ScoreCompImpl implements ScoreComp{

	@Override
	public String findScore(int matchId) {
		
		if (matchId == 101) {
			return "Test Match:345/6";
		}
		else if(matchId == 102) {
			return "One Day:253/7";
		}
		else 
			return "Wrong Match Id";
	
		
	}
	
	

}
