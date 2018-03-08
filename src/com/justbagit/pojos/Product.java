package com.justbagit.pojos;

import javax.persistence.*;


@Entity
@Table(name="Products")
public class Product {

	
	private Integer productId;

	private String description;

	private String imageURL;

	//private int size;

	private String title;

	private String unitPrice;



	private Category category;

	public Product() 
	{
		
		System.out.println("Product table creayed...");

		
	}

	@Id
	@GeneratedValue
	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
/*
	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}*/

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
/*
	@OneToMany(mappedBy="product")
	public List<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
*/

	@ManyToOne
	@JoinColumn(name="categoryId")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	

}