package com.paskasApp.servicei;

import java.util.List;

import com.paskasApp.model.CibilScore;



public interface CibilScoreServicei {

	CibilScore saveCibilScore(CibilScore cs);

	List<CibilScore> getCibilScores();

	CibilScore updateCibilScore(int cibilId, CibilScore cs);

	void deleteCibilScore(int cibilId);

}