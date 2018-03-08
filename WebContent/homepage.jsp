<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>JustBaggit</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="css/style.css" />

<link rel="stylesheet" type="text/css" href="css/iecss.css" />

<link rel="stylesheet" type="text/css" href="css/custom.css" />


<link rel="stylesheet" type="text/css" href="css/font-awesome.css" />

<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

<script type="text/javascript" src="js/boxOver.js"></script>
</head>
<body>
<div id="main_container">
  <div id="header">
    <div class="top_right">
      <div class="languages">
      
      
      
        <div class="lang_text">Languages:</div>
        
<%--          <div class="lang_text">Hello,${custName.firstName}</div>
 --%>        
                 <div class="lang_text">Hello,${sessionScope.customersDetails.firstName}</div>
        
        
        
        <a href="#" class="lang"><img src="images/en.gif" alt="" border="0" /></a> <a href="#" class="lang"><img src="images/de.gif" alt="" border="0" /></a> </div>
      <div class="big_banner"> <a href="#"><img src="" alt="" border="0" /></a> </div>
    </div>
    <div id="logo"> <a href="#"><img src="images/logo.png" alt="" border="0" width="182" height="85" /></a> </div>
  </div>
  <div id="main_content">
    <div id="menu_tab">
      <ul class="menu">
      
        <li><a href="#" class="nav"> Home </a></li>
        <li class="divider"></li>
        
        <li><a href="#" class="nav">Products</a></li>
        <li class="divider"></li>
        
        <li><a href="#" class="nav">Specials Offers</a></li>
        <li class="divider"></li>
        
        <li><a href="customer/update" class="nav">update</a></li>
        <li class="divider"></li>
        
        
        <li><a href="product/contactUs" class="nav">Contact Us</a></li>
        <li class="divider"></li>
        
        
        <li><a href="customer/login" class="nav">LogIn</a></li>
        <li class="divider"></li>
        
        
        
        <li><a href="customer/Adminlogin" class="nav">AdminLogin</a></li>
        <li class="divider"></li>
        
        
         <li><a href="customer/registration" class="nav">SignUp</a></li>
        <li class="divider"></li>
        
        
         <li><a href="customer/Adminregistration" class="nav">AdminRegister</a></li>
        <li class="divider"></li>
        
        
        
        <li><a href="product/AddProduct" class="nav">AddProduct</a></li>
        <li class="divider"></li>
        
        
        <li><a href="product/viewP" class="nav">viewProduct</a></li>
        <li class="divider"></li>
        
        <li><a href="Categorys/Category" class="nav">AddCategory</a></li>
        <li class="divider"></li>
        
        
        <li><a href="cart/addToCart" class="nav">AddToCart</a></li>
        <li class="divider"></li>
        
       
        
        <li><a href="#" class="nav">Shipping </a></li>
        <li class="divider"></li>
        
        
        <!-- <li><a href="contact.html" class="nav">Contact Us</a></li>
        <li class="divider"></li> -->
   <!--      <li><a href="details.html" class="nav">Details</a></li>
      </ul> -->
    </div>
    <!-- end of menu tab -->
    <div class="crumb_navigation"> Navigation: <span class="current">Home</span> </div>
    <div class="left_content">
      <div class="title_box">Categories</div>
      <ul class="left_menu">
        <li class="odd"><a href="#">Men</a></li>
        <li class="even"><a href="#">Women</a></li>
        <li class="odd"><a href="#">Childern</a></li>
      
      </ul>
      <div class="title_box">Special Products</div>
      <div class="border_box">
        <div class="product_title"><a href="#">Makita 156 MX-VL</a></div>
        <div class="product_img"><a href="#"><img src="images/p1.jpg" alt="" border="0" /></a></div>
        <div class="prod_price"><span class="reduce">350₹</span> <span class="price">270₹</span></div>
      </div>
      <div class="title_box">Newsletter</div>
      <div class="border_box">
        <input type="text" name="newsletter" class="newsletter_input" value="your email"/>
        <a href="#" class="join">subscribe</a> </div>
      <div class="banner_adds"> <a href="#"><img src="images/bann2.jpg" alt="" border="0" /></a> </div>
    </div>
    <!-- end of left content -->
    <div class="center_content">
      <div class="oferta"> <img src="images/p1.png" width="165" height="113" border="0" class="oferta_img" alt="" />
        <div class="oferta_details">
          <div class="oferta_title">Dell laptop bag</div>
          <div class="oferta_text"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco </div>
          <a href="#" class="prod_buy">details</a> </div>
      </div>
      <div class="center_title_bar">Latest Products</div>
      <div class="prod_box">
        <div class="center_prod_box">
          <div class="product_title"><a href="#">Skybag 156 MX-VL</a></div>
          <div class="product_img"><a href="#"><img src="images/p1.jpg" alt="" border="0" /></a></div>
          <div class="prod_price"><span class="reduce">350₹</span> <span class="price">270₹</span></div>
        </div>
        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
      </div>
      <div class="prod_box">
        <div class="center_prod_box">
          <div class="product_title"><a href="#">Fastrack XC</a></div>
          <div class="product_img"><a href="#"><img src="images/p2.jpg" alt="" border="0" /></a></div>
          <div class="prod_price"><span class="reduce">350₹</span> <span class="price">270₹</span></div>
        </div>
        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
      </div>
      <div class="prod_box">
        <div class="center_prod_box">
          <div class="product_title"><a href="#">VIP PP4</a></div>
          <div class="product_img"><a href="#"><img src="images/p4.jpg" alt="" border="0" /></a></div>
          <div class="prod_price"><span class="reduce">350₹</span> <span class="price">270₹</span></div>
        </div>
        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
      </div>
      <div class="prod_box">
        <div class="center_prod_box">
          <div class="product_title"><a href="#">Skybag 156 MX-VL</a></div>
          <div class="product_img"><a href="#"><img src="images/p3.jpg" alt="" border="0" /></a></div>
          <div class="prod_price"><span class="reduce">350₹</span> <span class="price">270₹</span></div>
        </div>
        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
      </div>
      <div class="prod_box">
        <div class="center_prod_box">
          <div class="product_title"><a href="#">Wildcraft XC</a></div>
          <div class="product_img"><a href="#"><img src="images/p5.jpg" alt="" border="0" /></a></div>
          <div class="prod_price"><span class="reduce">350₹</span> <span class="price">270₹</span></div>
        </div>
        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
      </div>
      <div class="prod_box">
        <div class="center_prod_box">
          <div class="product_title"><a href="#">Dell PP4</a></div>
          <div class="product_img"><a href="#"><img src="images/p6.jpg" alt="" border="0" /></a></div>
          <div class="prod_price"><span class="reduce">350₹</span> <span class="price">270₹</span></div>
        </div>
        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
      </div>
      <div class="center_title_bar">Recomended Products</div>
      <div class="prod_box">
        <div class="center_prod_box">
          <div class="product_title"><a href="#">American-tourister156 MX-VL</a></div>
          <div class="product_img"><a href="#"><img src="images/p7.jpg" alt="" border="0" /></a></div>
          <div class="prod_price"><span class="reduce">350₹</span> <span class="price">270₹</span></div>
        </div>
        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
      </div>
      <div class="prod_box">
        <div class="center_prod_box">
          <div class="product_title"><a href="#">VIP XC</a></div>
          <div class="product_img"><a href="#"><img src="images/p1.jpg" alt="" border="0" /></a></div>
          <div class="prod_price"><span class="reduce">350₹</span> <span class="price">270₹</span></div>
        </div>
        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
      </div>
      <div class="prod_box">
        <div class="center_prod_box">
          <div class="product_title"><a href="#">American-tourister P4</a></div>
          <div class="product_img"><a href="#"><img src="images/p3.jpg" alt="" border="0" /></a></div>
          <div class="prod_price"><span class="reduce">350 ₹</span> <span class="price">270 ₹</span></div>
        </div>
        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
      </div>
    </div>
    <!-- end of center content -->
    <div class="right_content">
      <div class="title_box">Search</div>
      <div class="border_box">
        <input type="text" name="newsletter" class="newsletter_input" value="keyword"/>
        <a href="#" class="join">search</a> </div>
      <div class="shopping_cart">
        <div class="title_box">Shopping cart</div>
        <div class="cart_details"> 3 items <br />
          <span class="border_cart"></span> Total: <span class="price">350₹</span> </div>
        <div class="cart_icon"><a href="#"><img src="images/shoppingcart.png" alt="" width="35" height="35" border="0" /></a></div>
      </div>
      <div class="title_box">What\92s new</div>
      <div class="border_box">
        <div class="product_title"><a href="#">Dell MX-VL</a></div>
        <div class="product_img"><a href="#"><img src="images/p2.jpg" alt="" border="0" /></a></div>
        <div class="prod_price"><span class="reduce">350₹</span> <span class="price">270₹</span></div>
      </div>
      <div class="title_box">Manufacturers</div>
      <ul class="left_menu">
        <li class="odd"><a href="#">American-tourister</a></li>
        <li class="even"><a href="#">Sky Bag</a></li>
        <li class="odd"><a href="#">Wild Craft</a></li>
        <li class="even"><a href="#">Fastrack</a></li>
        <li class="odd"><a href="#">V.I.P</a></li>
        <li class="even"><a href="#">Harrrison</a></li>
        <li class="odd"><a href="#">PUMA</a></li>
        <li class="even"><a href="#">Skybags</a></li>
      </ul>
      <div class="banner_adds"> <a href="#"><img src="images/bann1.jpg" alt="" border="0" /></a> </div>
    </div>
    <!-- end of right content -->
  </div>
  <!-- end of main content -->
  <div class="footer">
    <div class="left_footer"> <img src="images/footer_logo.png" alt="" width="89" height="42"/> </div>
    <div class="center_footer"> Template name. All Rights Reserved 2008<br />
      <a href="http://justbaggit.com"><img src="?	" alt="justbaggit" title="justbaggit" border="0" /></a><br />
      <img src="images/payment.gif" alt="" /> </div>
    <div class="right_footer"> <a href="#">home</a> <a href="#">about</a> <a href="#">sitemap</a> <a href="#">Like us on facebook</a> <a href="#">contact us</a> </div>
  </div>
</div>
<!-- end of main_container -->
</body>
</html>
