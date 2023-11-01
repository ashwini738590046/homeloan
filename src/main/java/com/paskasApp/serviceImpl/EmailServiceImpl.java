package com.paskasApp.serviceImpl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.paskasApp.model.EmailSender;
import com.paskasApp.servicei.EmailServicei;

@Service
public class EmailServiceImpl implements EmailServicei
{
     @Autowired
	JavaMailSender sender;
	
	@Override
	public void sendemail(EmailSender e) {
    SimpleMailMessage m=new SimpleMailMessage();
    
		m.setTo(e.getTo());
		m.setFrom(e.getFrom());
		m.setSubject(e.getSubject());
		m.setText(e.getTextBodyMsg());
	
		sender.send(m);
		System.out.println("sent");
		
	}

	@Override
	public void sendemailwithattachment(EmailSender e,MultipartFile file)  {
		MimeMessage mimeMessage=sender.createMimeMessage();
		
		try {
			MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);

			helper.setTo(e.getTo());
			helper.setFrom(e.getFrom());
			helper.setSubject(e.getSubject());
			helper.setText(e.getTextBodyMsg());
		
			helper.addAttachment(file.getOriginalFilename(), file);
			
		} catch (MessagingException e1) {
			e1.printStackTrace();
		}
		
		sender.send(mimeMessage);
	}

}
