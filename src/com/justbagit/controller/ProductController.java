package com.justbagit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.justbagit.pojos.Cart;
import com.justbagit.pojos.Category;
import com.justbagit.pojos.CustomersDetails;
import com.justbagit.pojos.Product;
import com.justbagit.service.AddToCartService;
import com.justbagit.service.ProductServiceI;


@Controller
@RequestMapping("/product")
public class ProductController
{
	@Autowired
	private ProductServiceI productServiceI;
	
	@Autowired
	private AddToCartService addToCartSeriveI;
	

	@RequestMapping("/homepage")
	public String showHomePage(CustomersDetails customersDetails)
	{
		System.out.println("from home page to login ");
		return "redirect:/homepage.jsp";
	}
	
	//___________________ADD TO Cart_______________________________
	
	
	

	@RequestMapping("/addtocart")
	public String addtocart(Cart cart )
	{
		
		System.out.println("from cart to addToCart ");
		return "cust/cart";
	}
	
	
		
	@RequestMapping(value="/addtocart/{id}",method=RequestMethod.POST)
	public String addToCart(HttpSession hs,@PathVariable int id,Cart cart)
	{
		System.out.println(id);
		System.out.println("inside actual add to cart");
		CustomersDetails customersDetails = (CustomersDetails)hs.getAttribute("customersDetails");
		//System.out.println("dadgagdvashgdghasvdhgsvdgsv"+customersDetails);
		if(customersDetails==null)
		{
			hs.setAttribute("msg", "log in first");
			return "redirect:login";
		}
		System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]]]]]");
		//System.out.println(cart);
		cart.setCustomerId(customersDetails.getCustomerId());
		System.out.println("cust"+customersDetails.getCustomerId());
		System.out.println("cart"+cart.getCustomerId());
		String status = addToCartSeriveI.addToCart(cart);		
		if(status == "success")
		{
			hs.setAttribute("msg", "product added in cart");
			return "redirect:homepage.jsp";
		}
		return "redirect:/homepage.jsp";
	}
	
	
	
	
	
	//_________________________dispactOder___________________________
	
	
	
	

	@RequestMapping("/checkout")
	public String showDispatchOrder(CustomersDetails customersDetails)
	{
		System.out.println("from home page to login ");
		return "cust/DispatchOrder";
	}
	
	
	
	
	
	////////////////////////////////////////////////////////////////////
	
	@RequestMapping("/AddProduct")
	public String showAddProductFrom(Model model, Product product)
	{
		System.out.println("forwarding to actual addproduct");
		
		List<Category>categorieslist = productServiceI.getCategory();
	   System.out.println("list"+categorieslist.toString()); 
		model.addAttribute("category_list",categorieslist);
		return "cust/AddProduct";
	}
	
	@RequestMapping(value="/AddProduct",method=RequestMethod.POST)
	public String processAddProductFrom(Model model,Product product   )
	{
		
	
	  // product.setCategory(category);
		
		System.out.println("AdddProduct herer ");
		
		 Integer id = productServiceI.addProduct(product);
		
		 model.addAttribute("addP","Product Added at "+ id +"u can add more");
		return "redirect:/product/AddProduct";
	}

	
	
	////remove product//////////////
	
	
	

	@RequestMapping("/DeleteProduct")
	public String showDeleteProductPage(Model model , Product product)
	{
		
		
		List<Product>productsList=productServiceI.getproductId();
		
		
		System.out.println("Product Id List--->"+productsList.toString());
		
		model.addAttribute("product_list",productsList);
		
		System.out.println("Forwording to delete Product");
		return "cust/DeleteProduct";
	}
	
	
	

	@RequestMapping("/Categorys")
	public String showCategoryPage(CustomersDetails customersDetails)
	{
		System.out.println("from home page to login ");
		return "cust/Categorys";
	}
	
	
	
	
	
	@RequestMapping( value = "/DeleteProduct" , method = RequestMethod.POST)
	public String processRemoveProductForm(Model map , Product p , RedirectAttributes flash)
	{
		
		productServiceI.removeProduct(p);
	    flash.addFlashAttribute("msg", " product successfully Deleted");
		return "redirect:";
	}
	
	
	@RequestMapping("/UpdateProduct")
	public String showUpdateProduct()
	{
		System.out.println("inside update product");
		
		return "cust/UpdateProduct";
	}
	
	
	/////////////////////////////////viewProduct//////////////////////////////////////
	
	
	@RequestMapping("/viewP")
	public String showViewProductForm(Model map , Product p)
	{
	    List<Product> productList = productServiceI.getProducts();
	    map.addAttribute("ProductList", productList);
	    System.out.println("===========>>>>>>>>>>>>");
		
	    return "cust/viewProduct"; 
	}
	
	@RequestMapping(value ="/viewP",method = RequestMethod.POST)
	public String processViewProductForm(Model map , Product p)
	{
		
		System.out.println("===========>>>>>>>>>>>>111111");
	    System.out.println("========>>>>>"+p.getProductId());
		return "cust/viewProduct";
	}
	
	
	/*@RequestMapping("/sortByOrder")
	public String showsortByPrice()
	{
		
		
		return "cust/sortByOrder";
	}*/
	
	/*@RequestMapping(value="/viewProduc",method=RequestMethod.POST)
	
	public String processSortByOrder()
	{
		return "sortByOrder";
	}*/
	/*	
	@RequestMapping("/sortByOrder")
	public String showsortByPrice()
	{
		
		
		return "cust/sortByOrder";
	}
	
	@RequestMapping(value="/viewProduct",method=RequestMethod.POST)
	
	public String processSortByOrder()
	{
		return "sortByOrder";
	}*/
	
	
	
	

	@RequestMapping("/contactUs")
	public String showcontactUsPage()
	{
		System.out.println("from home page to login ");
		return "cust/contact";
	}
	
	
	
	
	
	
	
	
	
	
}
