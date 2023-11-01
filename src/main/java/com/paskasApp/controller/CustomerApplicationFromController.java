package com.paskasApp.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paskasApp.model.CustomerApplicationFrom;
import com.paskasApp.model.CustomerDocuments;
import com.paskasApp.repositoryi.CustomerApplicationFromRepositoryi;
import com.paskasApp.servicei.CustomerApplicationFromServicei;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin("*")
@RestController
@RequestMapping("/cust")
@Slf4j //logging framework or logging class work like println 
public class CustomerApplicationFromController {
	
	@Autowired
	CustomerApplicationFromRepositoryi applicationFromRepositoryi;
	@Autowired
	CustomerApplicationFromServicei applicationFromServicei;
	
	@PostMapping("/saveCustData")
	public CustomerApplicationFrom saveCustData(@RequestPart ("customerPhoto") MultipartFile customerPhoto,
			@RequestPart ("customerSign") MultipartFile customerSign,
			@RequestPart ("customerPancard") MultipartFile customerPancard,
			@RequestPart ("customerAadharcard") MultipartFile customerAadharcard,
			@RequestPart ("customerApplicationFrom")  String customerApplicationFrom) {
		
		try {
			log.info("customerPhoto" +customerPhoto.getBytes() );
			log.info("customerSign"+customerSign.getBytes());
			log.info("customerPancard"+customerPancard.getBytes());
			log.info("customerAadharcard"+customerAadharcard.getBytes());
			log.info("customerApplicationFrom"+customerApplicationFrom);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectMapper objectMapper = new ObjectMapper();
		CustomerApplicationFrom custAppForm =null;
		
			 try {
				custAppForm = objectMapper.readValue(customerApplicationFrom.replaceAll("\\s+",""), CustomerApplicationFrom.class);
				log.info("Converted to Object customerApplicationFrom"+custAppForm );
			 } catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 try {
				 CustomerDocuments cd=new CustomerDocuments();
				cd.setCustomerPhoto(customerPhoto.getBytes());
				cd.setCustomerSign(customerSign.getBytes());
				cd.setCustomerPancard(customerPancard.getBytes());
				cd.setCustomerAadharcard(customerAadharcard.getBytes());
				custAppForm.setCustomerDocuments(cd);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
	
		CustomerApplicationFrom c=applicationFromServicei.saveCustData(custAppForm);
		return c;
	}
	
	
	@GetMapping("/getCustData/{customerId}")
	public CustomerApplicationFrom getCustData(@PathVariable long customerId) {
			
		CustomerApplicationFrom c=applicationFromServicei.getCustData(customerId);
		
		return c;
	}
	
	
	@GetMapping("/getCustAllData")
	public List<CustomerApplicationFrom> getCustAllData() {
			
			return applicationFromServicei.getCustAllData();
	}
	
	@PutMapping(value="/updateData/{customerId}")
	public CustomerApplicationFrom updateData(@PathVariable ("customerId")long customerId,@RequestBody CustomerApplicationFrom custAppForm) {
		
		
		return applicationFromServicei.updateData(customerId, custAppForm);
		
	}
	
	@DeleteMapping("/delete/{customerId}")
	public String delete(@PathVariable long customerId) {
		 applicationFromServicei.delete(customerId);
		 
		 return "Deleted...";
		 
	}
	

}
