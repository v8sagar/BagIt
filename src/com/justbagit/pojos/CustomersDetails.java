package com.justbagit.pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;


@Entity
public class CustomersDetails
{



	private Integer customerId;
	//@NotEmpty(message = "Name must not be blank")
	private String customersDetails;
	//@NotEmpty
	private String firstName;

	private String lastName;
	//@NotEmpty
	private String addres;
	//@NotEmpty
	private String emailId;
	//@NotEmpty
	private String mobileNo;
  // @NotNull
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date registrationDate;
	//@NotEmpty
	private String password;
	//private Date regDate;
	private int    role;
	
	private List<Order> orders;
	
	private List<DispatchAddress> dispatchAddresses;
	
	private List<Cart> cartsList; 
	
	
	public CustomersDetails() 
	{
		
		System.out.println("customer table created");
	}

	@Id
	@GeneratedValue
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="reg_date")
	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@OneToMany(cascade=CascadeType.ALL, mappedBy="customersDetails")	
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@OneToMany( cascade = CascadeType.ALL , mappedBy="customersDetails")
	public List<DispatchAddress> getDispatchAddresses() {
		return dispatchAddresses;
	}

	public void setDispatchAddresses(List<DispatchAddress> dispatchAddresses) {
		this.dispatchAddresses = dispatchAddresses;
	}

	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="customersDetails")	

	public List<Cart> getCartsList() {
		return cartsList;
	}

	public void setCartsList(List<Cart> cartsList) {
		this.cartsList = cartsList;
	}

	
	/*@OneToMany(mappedBy="customersDetails")
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

*/
	
	

	
}



