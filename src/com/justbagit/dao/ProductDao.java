package com.justbagit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.justbagit.pojos.Category;
import com.justbagit.pojos.Product;

@Repository
public class ProductDao implements ProductDaoI
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Integer addProduct(Product product)
	
	{

		String query ="select c from Category c where c.title=:nw";

		
		Category cat = (Category)	sessionFactory.getCurrentSession().createQuery(query).setParameter("nw", product.getCategory().getTitle()).uniqueResult();
		product.setCategory(cat);
		
		
		
       	return (Integer) sessionFactory.getCurrentSession().save(product);

	}

	@Override
	public List<Category> getCategory() {
		
		System.out.println("fetching data from table");

		
		String hql="select c.title from Category c";
		List<Category> categoriesList = sessionFactory.getCurrentSession().createQuery(hql).list();
		
		System.out.println("fetched data from table");
		
		return categoriesList;
	}

	@Override
	public void removeProduct(Product product) {

		
		
		sessionFactory.getCurrentSession().delete(product);
	}

	@Override
	public List<Product> getproductId() {
		
		System.out.println("inside get product id");
		
		String hql="select c.productId from Product c";
		
		List<Product>productsList=sessionFactory.getCurrentSession().createQuery(hql).list();
		
		System.out.println("select c.productId from Product c");
		
		
		
		return productsList;
	}

	@Override
	public List<Product> getProducts() 
	{
		String hql = "select p from Product p";
		List<Product> pList = sessionFactory.getCurrentSession().createQuery(hql).list();
		for (Product product : pList)
		{
			System.out.println(product);
		}
		
		return pList;
		
	}
	
	
	


	

}
