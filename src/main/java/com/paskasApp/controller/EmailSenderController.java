package com.paskasApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paskasApp.model.EmailSender;
import com.paskasApp.servicei.EmailServicei;


@CrossOrigin("*")
@RestController
@RequestMapping("/email")
public class EmailSenderController {

	
	    @Autowired
		EmailServicei esi;
	  
	    @Value("${spring.mail.username}")
	    String username;
		
		@PostMapping(value = "send")
		public String emailSend(@RequestBody EmailSender e) {
			e.setFrom(username);	 
			try {
				esi.sendemail(e);
			} catch (Exception e2) {
				e2.printStackTrace();
				return "fail";
			}
			
			return "send email successfully ";
		}
			
		@PostMapping(value = "sendattachment")
	public String emailSendwithattachment(@RequestParam("file") MultipartFile file,
				@RequestParam("data") String data) {
			System.out.println("call");
			try {
			ObjectMapper om=new ObjectMapper();
			    EmailSender e=om.readValue(data,EmailSender.class);
			e.setFrom(username);
			 	
				esi.sendemailwithattachment(e,file);
			} catch (Exception e2) {
				e2.printStackTrace();
				return "fail";
			}
			
			return "send email successfully ";
		}
		
		
	}

