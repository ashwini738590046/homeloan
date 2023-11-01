package com.paskasApp.servicei;

import java.util.List;

import com.paskasApp.model.Enquiry;

public interface EnquiryServicei {

	public Enquiry saveEnquiry(Enquiry e);

	public List<Enquiry> getAllEnquiryData();

}
