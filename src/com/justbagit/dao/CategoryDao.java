package com.justbagit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.justbagit.pojos.Category;

@Repository
public class CategoryDao implements CategoryDaoI
{

	@Autowired
	private SessionFactory sessionFactory; 
	
	
	@Override
	public String addNewCategory(Category category) 
	{
		Integer id=(Integer) sessionFactory.getCurrentSession().save(category);
		
		return "you have addedd category succesfully and your id is--->"   +id;

	}

}
