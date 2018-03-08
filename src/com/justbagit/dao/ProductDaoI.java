package com.justbagit.dao;

import java.util.List;

import com.justbagit.pojos.Category;
import com.justbagit.pojos.Product;

public interface ProductDaoI 
{
	  Integer addProduct(Product product);
	  List<Category> getCategory();
	  
	  List<Product> getproductId();
	  
	  void  removeProduct(Product product );
	  List<Product> getProducts();
	
	 
	 
	 //Integer addNewCategory()

	  /*List<Category> getKindsBags(Product product);
	  
	  List<Category> getMens
	  */


}
