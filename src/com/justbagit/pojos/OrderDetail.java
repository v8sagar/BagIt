package com.justbagit.pojos;

import javax.persistence.*;


@Entity

public class OrderDetail{

	
	private Integer orderDetailsId;

	private int quantity;

	private float unitPrice;
	


	

	
	private Order order;


	public OrderDetail() 
	{
		
		System.out.println("  orderDetails table  created ");
	}

	
	@Id
	@GeneratedValue	
	public Integer getOrderDetailsId() {
		return this.orderDetailsId;
	}

	public void setOrderDetailsId(Integer orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	
/*	@ManyToOne	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", title=" + title + ", products=" + products + "]";
	}
	@JoinColumn(name="customerId")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/

	
	@OneToOne
	@JoinColumn(name="orderId")
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}


	

	/*@ManyToOne
	@JoinColumn(name="productId")
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}*/

}