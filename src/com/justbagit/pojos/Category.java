package com.justbagit.pojos;


import javax.persistence.*;
import java.util.List;


@Entity
public class Category{


	private Integer categoryId;

	private String title;

	private List<Product> products;

	public Category() 
	{
		System.out.println("category table created");
	}

	@Id
	@GeneratedValue
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@OneToMany(mappedBy="category")
	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	



	


}