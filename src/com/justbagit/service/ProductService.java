package com.justbagit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.justbagit.dao.ProductDaoI;
import com.justbagit.pojos.Category;
import com.justbagit.pojos.Product;

@Service
@Transactional
public class ProductService implements ProductServiceI
{
	@Autowired
	private ProductDaoI daoI;

	@Override
	public Integer addProduct(Product product) 
	{
	
		
		return daoI.addProduct(product);
	}

	@Override
	public List<Category> getCategory() {
		return daoI.getCategory();
	}

	@Override
	public void removeProduct(Product product)
	{
		daoI.removeProduct(product);
		
	}

	@Override
	public List<Product> getproductId() 
	{
		return daoI.getproductId();
	}

	@Override
	public List<Product> getProducts()
	{
		
		return daoI.getProducts();
	}

}
