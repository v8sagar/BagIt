package com.justbagit.pojos;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Payment {

	
	private Integer paymentId;

	private int amount;

	@Temporal(TemporalType.DATE)
	private Date paymentDate;

	private String paymentMode;

	private Order order;

	
	private CustomersDetails customersDetails;
	
	
	public Payment()
	{
		System.out.println("payment table created");
	}

	
	@Id
	@GeneratedValue
	public Integer getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	@ManyToOne
	@JoinColumn(name="orderId")
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}


	@ManyToOne
	@JoinColumn(name="customerId")
	public CustomersDetails getCustomersDetails() {
		return customersDetails;
	}


	public void setCustomersDetails(CustomersDetails customersDetails) {
		this.customersDetails = customersDetails;
	}


	

}