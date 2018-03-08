package com.justbagit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.justbagit.dao.CategoryDaoI;
import com.justbagit.pojos.Category;

@Service
@Transactional
public class CategoryService implements CategoryServiceI 
{
	
	
	@Autowired
	CategoryDaoI categoryDaoI;

	@Override
	public String addNewCategory(Category category)
	{
		return categoryDaoI.addNewCategory(category);
	}
 

}
