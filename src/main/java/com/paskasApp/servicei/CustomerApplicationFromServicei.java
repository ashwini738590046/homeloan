package com.paskasApp.servicei;

import java.util.List;

import com.paskasApp.model.CustomerApplicationFrom;

public interface CustomerApplicationFromServicei {

	

	public CustomerApplicationFrom saveCustData(CustomerApplicationFrom c);
	
	public void delete(long customerId);
	public CustomerApplicationFrom getCustData(long customerId);



	public List<CustomerApplicationFrom> getCustAllData();

//	public CustomerApplicationFrom updateData(CustomerApplicationFrom custAppForm);

	public CustomerApplicationFrom updateData(long customerId, CustomerApplicationFrom custAppForm);
}
