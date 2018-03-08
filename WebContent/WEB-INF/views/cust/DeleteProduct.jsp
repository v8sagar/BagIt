<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>delete product Form</title>
    <link href="<c:url value='/css1/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/css1/custom.css' />" rel="stylesheet"></link>
</head>
<body>

        		<h3><a  href="homepage">homepage</a></h3>


 <div class="row">
            <div class="form-group col-md-12">
                
                
                <label class="col-md-3 control-lable" for="product">product_list</label>
                
                
                <div class="col-md-7">
                    
                   <form:select path="product.productId">
                   <form:option value="0" label="--select--"></form:option>    
                    <form:options items="${requestScope.product_list}"/>
                    </form:select>
                    
<%--                     <!-- <!----><form:input type="text" path="category" id="category" class="form-control input-sm"/>
 --%>                                        
                   <!--  
                    <div class="has-error">
                        <button type="submit" value="Submit">Submit</button>
 						 <button type="reset" value="Reset">Reset</button>
                        -->
                       
                         
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="DELETE" class="btn btn-primary btn-sm">
            </div>
        </div>
                       
                        <form:errors path="product" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>




</body>
</html>