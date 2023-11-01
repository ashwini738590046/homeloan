package com.paskasApp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paskasApp.model.CustomerApplicationFrom;
import com.paskasApp.repositoryi.CustomerApplicationFromRepositoryi;
import com.paskasApp.servicei.CustomerApplicationFromServicei;

@Service
public class CustomerApplicationFromServiceImpl implements CustomerApplicationFromServicei{
	@Autowired
	CustomerApplicationFromRepositoryi customerApplicationFromRepositoryi;

	@Override
	public CustomerApplicationFrom saveCustData(CustomerApplicationFrom c) {
		
		return customerApplicationFromRepositoryi.save(c);
	}

	

	@Override
	public void delete(long customerId) {
		
		customerApplicationFromRepositoryi.deleteById(customerId);
	}



	@Override
	public CustomerApplicationFrom getCustData(long customerId) {
		Optional<CustomerApplicationFrom> oc=customerApplicationFromRepositoryi.findById(customerId);
		CustomerApplicationFrom c=oc.get();
		return c;
	}



	@Override
	public List<CustomerApplicationFrom> getCustAllData() {
		
		return customerApplicationFromRepositoryi.findAll();
	}



	@Override
	public CustomerApplicationFrom updateData(long customerId,CustomerApplicationFrom custAppForm) {
		
		Optional<CustomerApplicationFrom> oc=customerApplicationFromRepositoryi.findById(customerId);
		
		if(oc.isPresent()) {
			
			CustomerApplicationFrom customerApplicationFrom=oc.get();
			return customerApplicationFromRepositoryi.save(customerApplicationFrom);
		}
		else {
		 return null;
		}
	}



	

	

	
}
