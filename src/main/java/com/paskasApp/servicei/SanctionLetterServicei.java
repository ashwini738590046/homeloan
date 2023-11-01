package com.paskasApp.servicei;

import java.util.List;

import com.paskasApp.model.SanctionLetter;

public interface SanctionLetterServicei {

	public SanctionLetter savesanctionLetter(SanctionLetter sl);

	public List<SanctionLetter> getSanctionLetter();

}
