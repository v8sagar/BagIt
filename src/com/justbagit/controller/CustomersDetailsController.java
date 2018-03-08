package com.justbagit.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.justbagit.pojos.CustomersDetails;
import com.justbagit.pojos.Product;
import com.justbagit.service.ICustomersDetailsService;




@Controller
@RequestMapping("/customer")
public class CustomersDetailsController
{
	@Autowired
	private ICustomersDetailsService iCustomersDetailsService;
	
	
	
	//////////////////////homepage///////////////////////////
	
	
	@RequestMapping("/homepage")
	public String showHomePage(CustomersDetails customersDetails)
	{
		System.out.println("from home page to login ");
		return "redirect:/homepage.jsp";
	}
	
	
	
	
	/////////////////// registration///////////////////////////////////////////
	@RequestMapping("/registration")
	public String showRegistrationFrom(CustomersDetails customersDetails)
	{
		System.out.println("from registration to login ");
		return "cust/registration";
	}
	
	
/////////////////// registration///////////////////////////////////////////
@RequestMapping("/Adminregistration")
public String showAdminRegistrationFrom(CustomersDetails customersDetails)
{
System.out.println("from registration to login ");
return "cust/AdminRegister";
}
	
	
	
	@RequestMapping(value="/Adminregistration",method=RequestMethod.POST)
	public String processRegFrom(Model map,CustomersDetails customersDetails,RedirectAttributes flashMap)
	{
		System.out.println("inside registrion process from");
		
		String mesg1 = iCustomersDetailsService.registerCustomer(customersDetails);
		
		if (mesg1.contains("Failed"))
		{
			map.addAttribute("mesg", mesg1);
			return "cust/AdminLogin";
		}
		flashMap.addFlashAttribute("mesg", mesg1.concat("Proceed to Login"));
		return "redirect:/cust/AdminLogin";

		
	}
	
	
	
	
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public String processAdminRegFrom(Model map,CustomersDetails customersDetails,RedirectAttributes flashMap)
	{
		System.out.println("inside registrion process from");
		
		String mesg1 = iCustomersDetailsService.registerCustomer(customersDetails);
		
		if (mesg1.contains("Failed"))
		{
			map.addAttribute("mesg", mesg1);
			return "cust/registration";
		}
		flashMap.addFlashAttribute("mesg", mesg1.concat("Proceed to Login"));
		return "redirect:/cust/login";

		
	}
	
	
	
	
	
	///////////////////////updat profile////////////////////////
	
	
	
	
	@RequestMapping("/update")
	public String showupdateFrom(CustomersDetails customersDetails)
	{
		System.out.println("from update  ");
		return "cust/update";
	}
	
	
	
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String processupdateFrom(Model map,CustomersDetails customersDetails,RedirectAttributes flashMap)
	{
		System.out.println("inside update process from");
		
		String mesg1 = iCustomersDetailsService.registerCustomer(customersDetails);
		
		if (mesg1.contains("Failed"))
		{
			map.addAttribute("mesg", mesg1);
			return "cust/update";
		}
		flashMap.addFlashAttribute("mesg", mesg1.concat("Proceed to Login"));
		return "redirect:/cust/login";

		
	}
	
		
	
	///////////////////// login /////////////////////////////////////////

	@RequestMapping("/login")
	public String showLoginForm(CustomersDetails customersDetails)
	{
		System.out.println("inside login form and forwarding to login ");
		return "cust/login";
	}

	

	@RequestMapping("/Adminlogin")
	public String showAdminLoginForm(CustomersDetails customersDetails)
	{
		System.out.println("inside login form and forwarding to login ");
		return "cust/login";
	}
	
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String processLoginForm(CustomersDetails customersDetails, HttpSession httpSession, Model map) 
	{
		
		System.out.println("inside actual  login form ");
		CustomersDetails customersDetail = iCustomersDetailsService.validateCustomer(customersDetails.getEmailId(), customersDetails.getPassword());
		
		System.out.println("after service ");
		
		if (customersDetail != null) {

			
			//map.addAttribute("cust_dtls", hs.getAttribute("valid_cust"));

			httpSession.setAttribute("customersDetails", customersDetail);

		    System.out.println("============>>>>>>11111");
		    
			//httpSession.setAttribute("cart", new ArrayList<Integer>());
			
			return "redirect:/homepage.jsp";
		}
		System.out.println("============>>>>>>22222");
		map.addAttribute("invalidLoginMessage", "Invalid Login Id or Password plese try again");
		return "cust/login";
	}
	
	
	
	
	
	
	@RequestMapping(value = "/Adminlogin", method = RequestMethod.POST)
	public String processAdminLoginForm(CustomersDetails customersDetails, HttpSession httpSession, Model map) 
	{
		
		System.out.println("inside actual  login form ");
		CustomersDetails customersDetail = iCustomersDetailsService.validateCustomer(customersDetails.getEmailId(), customersDetails.getPassword());
		
		System.out.println("after service ");
		
		if (customersDetail != null) {

			
			//map.addAttribute("cust_dtls", hs.getAttribute("valid_cust"));

			httpSession.setAttribute("customersDetails", customersDetail);
			
			httpSession.setAttribute("cart",new HashMap<Integer, Product>());


		    System.out.println("============>>>>>>11111");
		    
			//httpSession.setAttribute("cart", new ArrayList<Integer>());
			
			return "redirect:/homepage.jsp";
		}
		System.out.println("============>>>>>>22222");
		map.addAttribute("invalidLoginMessage", "Invalid Login Id or Password plese try again");
		return "cust/Adminlogin";
	}
	
	
	
	
	


	
	
	
	
	
	
	/////////////////////// categories////////////////////////////////////////////
	
	
	
	
	@RequestMapping("/categories")
	public String showHomepage(CustomersDetails customersDetails)
	{
		System.out.println("========>>>>>>>>>>>>444444");
		return "/cust/homepage";
	}
	
	
	


}

