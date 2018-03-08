package com.justbagit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomePageController {
	@Controller
	@RequestMapping("/homepage")
	public class HomeCotroller
	{/*
	    @RequestMapping("/homepage")
	    public String home()
	    {
	    	System.out.println("in side home");
	    	return "homepage";
	    }*/
	    @RequestMapping("/contactUs")
	    public String abouthp()
	    {
	    	System.out.println("in side abouthp");
	    	return "cust/contactUs";
	    }
	    @RequestMapping("/services")
	    public String sevices()
	    {
	    	System.out.println("in side abouthp");
	    	return "services";
	    }
	    @RequestMapping("/contact")
	    public String contact()
	    {
	    	System.out.println("in side abouthp");
	    	return "contact";
	    }
	}
	
	
	

}
