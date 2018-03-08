package com.justbagit.dao;

import java.util.List;

import com.justbagit.pojos.*;

public interface AddToCartDao
{
 List<Product> addToCart(int id);
 
 String addToCart(Cart cart);
}
