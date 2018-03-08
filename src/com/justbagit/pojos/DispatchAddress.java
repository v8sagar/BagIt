package com.justbagit.pojos;

import javax.persistence.*;


@Entity

public class DispatchAddress  {


	private Integer addressId;

	private String cityName;

	private int pinCode;

	private String stateName;

	private String streetName;

	
	private CustomersDetails customersDetails;

	public DispatchAddress()
	{
		System.out.println("DispatchAddress table created");
	}

	
	@Id
    @GeneratedValue
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
/*
	@ManyToOne
	@JoinColumn(name="customerId")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
*/

	@ManyToOne
	@JoinColumn(name="customerId")
	public CustomersDetails getCustomersDetails() {
		return customersDetails;
	}


	public void setCustomersDetails(CustomersDetails customersDetails) {
		this.customersDetails = customersDetails;
	}


	
	

}