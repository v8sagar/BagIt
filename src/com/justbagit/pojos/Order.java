package com.justbagit.pojos;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Orders")
public class Order{

	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", amount=" + amount + ", orderDate=" + orderDate + ", customersDetails="
				+ customersDetails + ", orderDetails=" + orderDetails + ", payments=" + payments + "]";
	}

	private Integer orderId;

	private float amount;

	@Temporal(TemporalType.DATE)
	@Column(name="OrderDate")
	private Date orderDate;
	
	private CustomersDetails customersDetails;

	private OrderDetail orderDetails;

	private List<Payment> payments;

	public Order()
	{
		System.out.println("order table creayed...");
	}
	
	@Id
	@GeneratedValue
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public float getAmount() {
		return this.amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	@ManyToOne
	@JoinColumn(name="customerId")
	public CustomersDetails getCustomersDetails() {
		return customersDetails;
	}


	public void setCustomersDetails(CustomersDetails customersDetails) {
		this.customersDetails = customersDetails;
	}

	@OneToOne(cascade=CascadeType.ALL,mappedBy="order")
	
	public OrderDetail getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetail orderDetails) {
		this.orderDetails = orderDetails;
	}

	
	
/*	public List<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public OrderDetail addOrderDetail(OrderDetail orderDetail) {
		getOrderDetails().add(orderDetail);
		orderDetail.setOrder(this);

		return orderDetail;
	}

	public OrderDetail removeOrderDetail(OrderDetail orderDetail) {
		getOrderDetails().remove(orderDetail);
		orderDetail.setOrder(null);

		return orderDetail;
	}

	@ManyToOne
	@JoinColumn(name="customerId")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
*/
	
	@OneToMany(mappedBy="order")
	public List<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}



}