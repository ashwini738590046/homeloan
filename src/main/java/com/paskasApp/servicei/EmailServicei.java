package com.paskasApp.servicei;

import org.springframework.web.multipart.MultipartFile;

import com.paskasApp.model.EmailSender;

public interface EmailServicei {

	public void sendemail(EmailSender e);
	public void sendemailwithattachment(EmailSender e,MultipartFile file);

}
