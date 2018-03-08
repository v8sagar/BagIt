package com.justbagit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.justbagit.pojos.CustomersDetails;
import com.justbagit.pojos.*;

@Repository
public class CustomersDetailsDao implements ICustomersDetails
{
	@Autowired
	private SessionFactory sessionFactory; 
	

	@Override
	public String registerCustomer(CustomersDetails customersDetails)
	{
		System.out.println("inside  registerCustomer method");
		Integer id=(Integer) sessionFactory.getCurrentSession().save(customersDetails);
		return "you have registered succesfully and your id is--->"   +id;
	
		//return null;
	}


	@Override
	public CustomersDetails loginCustomer(String emailId, String password)
	{
		System.out.println("inside loginCustomer method");
		//Integer id=(Integer) sessionFactory.getCurrentSession().createQuery("select c from CustomersDetails c where c.emailId=:email and c.password=:pass ").uniqueResult();
		return (CustomersDetails) sessionFactory.getCurrentSession().createQuery("select c from CustomersDetails c where c.emailId=:email and c.password=:pass ").uniqueResult();
	}


	@Override
	public CustomersDetails validateCustomer(String emailId, String password)
	{
		return (CustomersDetails)sessionFactory.getCurrentSession().createQuery("select c from CustomersDetails c where c.emailId = :em and c.password = :pass").setParameter("em", emailId).setParameter("pass", password).uniqueResult();
	}


	@Override
	public String forgotPassword(String emailId, String password) {
		System.out.println("inside forgotpassword dao");
		Integer id=(Integer)sessionFactory.getCurrentSession().save(emailId, password);
		return "you have successfully changed password";
	}


	@Override
	public String updatecustomer(CustomersDetails customersDetails) {

		/*String hql="select c from CustomersDetails c where c.cityName=:nm";
		CustomersDetails c1 =(CustomersDetails) sessionFactory.getCurrentSession().createQuery(hql).setParameter("nm",cityname).uniqueResult();
		customersDetails.(c1);
		sessionFactory.getCurrentSession().saveOrUpdate(customersDetails);
*/		
		Integer id=(Integer) sessionFactory.getCurrentSession().save(customersDetails);

		return "update Sucessfully...";
	}
	
	
	

}
