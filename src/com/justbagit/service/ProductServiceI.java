package com.justbagit.service;

import java.util.List;

import com.justbagit.pojos.Category;
import com.justbagit.pojos.Product;

public interface ProductServiceI
{
	 Integer addProduct(Product product);
	 List<Category> getCategory();
	 List<Product> getproductId();

	  void  removeProduct(Product product );
	List<Product> getProducts();
	


}
