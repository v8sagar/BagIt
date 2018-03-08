package com.justbagit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.justbagit.dao.AddToCartDao;
import com.justbagit.pojos.Cart;
import com.justbagit.pojos.Product;
@Service
@Transactional
public class AddToCartServiceImpl implements AddToCartService
{
	
  @Autowired
  private AddToCartDao dao;

	@Override
	public List<Product> addToCart(int id)
	{
		return dao.addToCart(id);
	}
/*
	@Override
	public List<Product> addToCart(Cart cart) {
		
		
		
		
		return dao.addToCart(cart);
	}
*/

	@Override
	public String addToCart(Cart cart) {

		
		
		return dao.addToCart(cart);
	}
}
