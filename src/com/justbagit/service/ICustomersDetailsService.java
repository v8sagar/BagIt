package com.justbagit.service;


import com.justbagit.pojos.CustomersDetails;

public interface ICustomersDetailsService
{
	String registerCustomer(CustomersDetails customersDetails);
	CustomersDetails validateCustomer(String emailId,String password);
	
	String updatecustomer(CustomersDetails customersDetails );



}
