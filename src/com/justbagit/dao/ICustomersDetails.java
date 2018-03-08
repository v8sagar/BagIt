package com.justbagit.dao;

import com.justbagit.pojos.*;

public interface ICustomersDetails
{
	String registerCustomer(CustomersDetails customersDetails);
	CustomersDetails loginCustomer(String emailId,String password);
	CustomersDetails validateCustomer(String emailId,String password);
	String forgotPassword(String emailId,String password);
	
	String updatecustomer(CustomersDetails customersDetails );


}
