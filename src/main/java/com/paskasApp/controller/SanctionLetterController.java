package com.paskasApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paskasApp.model.SanctionLetter;
import com.paskasApp.servicei.SanctionLetterServicei;

@CrossOrigin("*")
@RestController
@RequestMapping("/sanctionLetter")
public class SanctionLetterController {
	@Autowired 
	SanctionLetterServicei sls;
	
	
	@PostMapping("/savesanctionLetter")
	public SanctionLetter savesanctionLetter(@RequestBody SanctionLetter sl) {
		return sls.savesanctionLetter(sl);
	}
	
	@GetMapping("/getSanctionLetter")
	public List<SanctionLetter> getAllSanctionLetter(){
		return sls.getSanctionLetter();
	}

}
