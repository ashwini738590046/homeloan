package com.paskasApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paskasApp.model.Enquiry;
import com.paskasApp.servicei.EnquiryServicei;



@CrossOrigin("*")
@RestController
@RequestMapping("/enquiry")
public class EnquiryController {
	
	@Autowired 
	EnquiryServicei esi;
	
	@PostMapping("/saveEnquiry")
	public Enquiry saveEnquiry(@RequestBody Enquiry e) {
		return esi.saveEnquiry(e);
	}
	
	@GetMapping("/getAllEnquiryData")
	public List<Enquiry> getAllEnquiryData(){
		
		return esi.getAllEnquiryData();
	}
	

}
