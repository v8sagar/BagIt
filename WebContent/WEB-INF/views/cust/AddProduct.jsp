
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title> Add  New Product </title>
    <link href="<c:url value='/css1/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/css1/custom.css' />" rel="stylesheet"></link>
</head>
<body>

 <div class="form-container">
     
    <h1 align="center">Add Product</h1>
    
        <h3 align="center" style="color: red;">${requestScope.addP}</h3>
        
       
       <div class="lang_text">${sessionScope.addP}</div>
    
     
    <form:form method="POST" modelAttribute="product" class="form-horizontal">

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="title">Name Of Product</label>
                <div class="col-md-7">
                    <form:input type="text" path="title" id="title" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="title" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="description">Description Of Product</label>
                <div class="col-md-7">
                    <form:input type="text" path="description" id="description" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="description" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
        <%-- <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="addres">Address</label>
                <div class="col-md-7">
                    <form:input type="text" path="addres" id="addres" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="addres" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
         --%>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="imageURL">Image</label>
                <div class="col-md-7">
                    <form:input type="text" path="imageURL" id=" imageURL" class="form-control input-sm"/>
                    <div class="has-error">
                       <%--  <form:errors path=" emailId" class="help-inline"/> --%>
                    </div>
                </div>
            </div>
        </div> 
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="unitPrice">Price</label>
                <div class="col-md-7">
                    <form:input type="text" path="unitPrice" id="unitPrice" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="unitPrice" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                
                
                <label class="col-md-3 control-lable" for="category">Select Category</label>
                
                
                <div class="col-md-7">
                    
                   <form:select path="category.title">
                   <form:option value="0" label="--select--"></form:option>    
                    <form:options items="${requestScope.category_list}"/>
                    </form:select>
                    
<%--                     <!-- <!----><form:input type="text" path="category" id="category" class="form-control input-sm"/>
 --%>                                        
                    
                    <div class="has-error">
                       
                       
                       
                        <form:errors path="category" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
      
              
         
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="AddProduct" class="btn btn-primary btn-sm">
            </div>
        </div>
        		<h3>${requestScope.msg}</h3>
        		
      <h3><a  href="DeleteProduct">DeleteProduct</a></h3>
      
      
       <h3><a  href="UpdateProduct">UpdateProduct</a></h3>
        		
<!--         <h3><a  href="/Categorys/Category">Category</a></h3>
 -->        		
 <h3><a  href="homepage">HomePage</a></h3>
        
    </form:form>
    </div>




</body>
</html>