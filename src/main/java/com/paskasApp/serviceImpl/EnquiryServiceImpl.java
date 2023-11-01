package com.paskasApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paskasApp.model.Enquiry;
import com.paskasApp.repositoryi.EnquiryRepositoryi;
import com.paskasApp.servicei.EnquiryServicei;

@Service
public class EnquiryServiceImpl  implements EnquiryServicei {
	
	@Autowired
	EnquiryRepositoryi eri;
	
	@Override
	public Enquiry saveEnquiry(Enquiry e) {
		
		return eri.save(e);
	}

	@Override
	public List<Enquiry> getAllEnquiryData() {
		
		return eri.findAll();
	}

}
