package com.justbagit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.justbagit.dao.ICustomersDetails;
import com.justbagit.pojos.CustomersDetails;

@Service
@Transactional
public class CustomersDetailsService implements ICustomersDetailsService
{
	@Autowired
	private ICustomersDetails cut;

	@Override
	public String registerCustomer(CustomersDetails customersDetails)
	{
		// TODO Auto-generated method stub
		return cut.registerCustomer(customersDetails);
	}

	@Override
	@Transactional(readOnly=true)
	public CustomersDetails validateCustomer(String emailId, String password)
	{
		// TODO Auto-generated method stub
		return cut.validateCustomer(emailId, password);
	}

	@Override
	public String updatecustomer(CustomersDetails customersDetails) {
		// TODO Auto-generated method stub
		return cut.registerCustomer(customersDetails);
		
	}

}
