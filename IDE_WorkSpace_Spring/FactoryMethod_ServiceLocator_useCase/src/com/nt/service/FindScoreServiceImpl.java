package com.nt.service;

import com.nt.external.ScoreComp;

public class FindScoreServiceImpl implements FindScoreService {

	private ScoreComp externalComp;
	
	
	
	public void setExternalComp(ScoreComp externalComp) {
		this.externalComp = externalComp;
	}



	@Override
	public String getScore(int matchId) {
		String scoreCard=null;
		
		scoreCard=externalComp.findScore(matchId);
		return scoreCard;
	}

}
