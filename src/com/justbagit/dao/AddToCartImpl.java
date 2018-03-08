package com.justbagit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.justbagit.pojos.*;

@Repository
public class AddToCartImpl implements AddToCartDao
{
	
	@Autowired
	 private SessionFactory sessionFactory;

	@Override
	public List<Product> addToCart(int id)
	{
		
		String hql = "select p from Product p where p.productId=:pid";
		return sessionFactory.getCurrentSession().createQuery(hql).setParameter("pid",id).list();
		
		
		
	}
	
	

	@Override
	public String addToCart(Cart cart) {

		System.out.println("in add to cart 1");
		System.out.println(cart);
		System.out.println("]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]][[[[[[[[[[[[[[[[[[");
		System.out.println(cart.getProduct().getProductId());
		String hql = "select c from Cart c where c.customerId= :id";
		Cart newCart = (Cart) sessionFactory.getCurrentSession().createQuery(hql)
				.setParameter("id", cart.getCustomerId()).uniqueResult();
		
		String hql2 = "select cust from CustomersDetails cust where cust.customerId=:id";
		
		CustomersDetails customersDetails = (CustomersDetails) sessionFactory.getCurrentSession()
				.createQuery(hql2).setParameter("id",cart.getCustomerId()).uniqueResult();
		
		String query1 = "select p from Product p where p.productId=:pid";
		Product p = (Product)sessionFactory.getCurrentSession().createQuery(query1).setParameter("pid", cart.getProduct().getProductId()).uniqueResult();
		cart.setProduct(p);
		System.out.println("in addto cart dao 2");
		String query = "select c from Cart c where c.customerId=:id and c.product=:pid1";
		Cart ucart=(Cart) sessionFactory.getCurrentSession().createQuery(query).setParameter("id", cart.getCustomerId()).setParameter("pid1", cart.getProduct()).uniqueResult(); 
		if(ucart==null)
		{
			System.out.println("in new save");
			sessionFactory.getCurrentSession().save(cart);
			return "success";
		}
		else
		{
			int qty = ucart.getQuantity();
			int newqty = qty + cart.getQuantity();
			if(newqty<6)
			{
				System.out.println("in old save");
				cart.setQuantity(newqty);
				String query2 = "update Cart c set c.quantity=:nw where c.custId=:cid and c.product=:pid2 ";
				sessionFactory.getCurrentSession().createQuery(query2).setParameter("nw", cart.getQuantity()).setParameter("cid", cart.getCustomerId()).setParameter("pid2", cart.getProduct()).executeUpdate();
				return "success";
			}
		}
		return "success";
	}

}
