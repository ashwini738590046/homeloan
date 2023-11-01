package com.paskasApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paskasApp.model.SanctionLetter;
import com.paskasApp.repositoryi.SanctionLetterRepositoryi;
import com.paskasApp.servicei.SanctionLetterServicei;

@Service
public class SanctionLetterServiceImpl implements SanctionLetterServicei {
	@Autowired
	SanctionLetterRepositoryi slr;

	@Override
	public SanctionLetter savesanctionLetter(SanctionLetter sl) {
	
		return slr.save(sl);
	
	}

	@Override
	public List<SanctionLetter> getSanctionLetter() {
		
		return slr.findAll();
	}

}
