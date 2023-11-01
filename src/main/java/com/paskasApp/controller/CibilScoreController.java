package com.paskasApp.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paskasApp.model.CibilScore;
import com.paskasApp.servicei.CibilScoreServicei;

@CrossOrigin("*")
@RestController
@RequestMapping("/cibil")
public class CibilScoreController 
{
	@Autowired
	CibilScoreServicei csi;
	
	Random r=new Random();
	
//	@GetMapping("/cibilScores")

	@RequestMapping("/getpancard/{pancard}")
	public int getcibil(@PathVariable String pancard)
	{
		 System.out.println(pancard);
		if(pancard.length()==12)
				{
					 int cibil = r.nextInt(700,900);

					 return cibil;
				}
		
		return 0;
	}
	@PostMapping("/cibilScore")
	public CibilScore saveCibilScore(@RequestBody CibilScore cs)
	{
		
		return csi.saveCibilScore(cs);
	}
//	public List<CibilScore> getCibilScores()
//	{
//		return csi.getCibilScores();
//	}
	
	@PutMapping("/cibilScore/{cibilId}")
	public CibilScore updateCibilScore(@PathVariable int cibilId , @RequestBody CibilScore cs)
	{
		return csi.updateCibilScore(cibilId,cs);
	}
	
	@DeleteMapping("/cibilScore/{cibilid}")
	public String deleteCibilScore(@PathVariable int cibilId)
	{
		csi.deleteCibilScore(cibilId);
		
		return "CibilScore deleted";
	}

}
