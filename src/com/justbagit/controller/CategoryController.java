package com.justbagit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.justbagit.pojos.Category;
import com.justbagit.pojos.CustomersDetails;
import com.justbagit.service.CategoryServiceI;

@Controller
@RequestMapping("/Categorys")
public class CategoryController 
{
	@Autowired
	CategoryServiceI categoryServiceI;
		
	@RequestMapping("/homepage")
	public String showHomePage(CustomersDetails customersDetails)
	{
		System.out.println("from home page to login ");
		return "redirect:/homepage.jsp";
	}

	@RequestMapping("/Category")
	public String categorysFrom(Category category)
	{
		System.out.println("from registration to login ");
		return "cust/Category";
	}
	
	/////////////////// Add new Categorys///////////////////////////////////////////

	
	@RequestMapping(value="/Category",method=RequestMethod.POST)
	public String processCategorysFrom(Model map,Category category  ,RedirectAttributes flashMap)
	{
		System.out.println("inside registrion process from");
		
		String mesg1 = categoryServiceI.addNewCategory(category);
		
		if (mesg1.contains("Failed"))
		{
			map.addAttribute("mesg", mesg1);
			return "cust/registration";
		}
		flashMap.addFlashAttribute("mesg", mesg1.concat("Proceed to Login"));
		return "redirect:/Categorys/Category";

		
	}
	
	
	

}
