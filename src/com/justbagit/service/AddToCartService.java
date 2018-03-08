package com.justbagit.service;

import java.util.List;

import com.justbagit.pojos.Cart;
import com.justbagit.pojos.Product;


public interface AddToCartService
{
	 String addToCart(Cart cart);

	List<Product> addToCart(int id);
}
