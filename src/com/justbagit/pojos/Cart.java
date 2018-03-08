package com.justbagit.pojos;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Cart  {
	

	@Id
	@GeneratedValue
	@Column(name="CartId")
	private Integer cartId;

	@Column(name="CustomerId")
	private int customerId;

	@Column(name="Quantity")
	private int quantity;

	@ManyToOne
	@JoinColumn(name="ProductId")
	private Product product;
	
	
	@ManyToOne
	@JoinColumn(name="customerId")
	private CustomersDetails customersDetails;
	

	public Cart() 
	{
		System.out.println("Cart Table Created");
		
	}

	public Integer getCartId() {
		return this.cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CustomersDetails getCustomersDetails() {
		return customersDetails;
	}

	public void setCustomersDetails(CustomersDetails customersDetails) {
		this.customersDetails = customersDetails;
	}

	
	
	

}