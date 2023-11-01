package com.paskasApp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paskasApp.model.CibilScore;
import com.paskasApp.repositoryi.CibilScoreRepositoryi;
import com.paskasApp.servicei.CibilScoreServicei;

@Service
public class CibilScoreServiceImpl implements CibilScoreServicei {
	
		@Autowired
		CibilScoreRepositoryi csr;

		@Override
		public CibilScore saveCibilScore(CibilScore cs) {
			
			return csr.save(cs);
		}

		@Override
		public List<CibilScore> getCibilScores() {
			
			return csr.findAll();
		}

		@Override
		public CibilScore updateCibilScore(int cibilId, CibilScore cs) {
			
			Optional<CibilScore> op = csr.findById(cibilId);
			
			if(op.isPresent())
			{
				CibilScore cibilscore = op.get();
				return csr.save(cibilscore);
			}
			else
			{
				return null;
			}
			
		}

		@Override
		public void deleteCibilScore(int cibilId) {
			
			csr.deleteById(cibilId);
			
		}

}
