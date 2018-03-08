
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>





<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="<c:url value='/css1/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/css1/custom.css' />" rel="stylesheet"></link>
<title>viewProduct</title>
</head>
<body>
                 <div class="lang_text">Hello,${sessionScope.customersDetails.firstName}</div>


 <h3><a  href="homepage">homepage</a></h3>

<form action="cust/DispatchOrder">
 <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="Check Out" class="btn btn-primary btn-sm" />
            </div>
        </div>
        
 </form> 
        
        
        
        
        

<form:form method="post" modelAttribute="product">

	<c:forEach var="pr" items="${requestScope.ProductList}">
    	<div class="col-md-12">
			<div class="col-sm-6 col-md-4">
				<div class="thumbnail" >
					<h4 class="text-center">
					<%-- <span class="label label-info">
					<form:radiobutton path="productId" value="${pr.productId}"/></span> --%>
					</h4>
<%-- 					<img src="<spring:url value='/uploads/${pr.imageURL}'></spring:url>" class="img-responsive">
 --%>					<div class="caption">
						<div class="row">
						
						<div class="col-md-6 col-xs-6 price">
								<h3>
								<label>productId ${pr.productId}</label></h3>
							</div>
							
						<br>
						
							<div class="col-md-6 col-xs-6">
								<h3>${pr.title}</h3>
							</div>
							
							
							<div class="col-md-6 col-xs-6 price">
								<h3>
								<label>&#8377;&nbsp;${pr.unitPrice}</label></h3>
							</div>
							
						</div>
						<p>${pr.description}</p>
						
							  <div class="row">
							  
							  <form:input type="text"  path="productId"  class="form-control input-sm"/>  
						 
			<!-- 			
                           <div class="form-actions floatRight">
                <input type="submit" value="ADD TO Cart" class="btn btn-primary btn-sm">
            </div> -->
            
            
<%--             <form:form action="addtocart" method="post" modelAttribute="cart">
 --%>            
            
            <button formaction="addtocart/${pr.productId}">addtocart</button>
            
            
            
            
            
        </div>		
					
						<p> </p>
					</div>
				</div>
			</div>
			</div>

	</c:forEach>
	
		
	
	</form:form>
    
    </div>
<%--       <p class="bg-danger">${requestScope.msg}</p>
 --%>
 


              <h3><a  href="homepage">homepage</a></h3>
                 
       


</body>
</html>