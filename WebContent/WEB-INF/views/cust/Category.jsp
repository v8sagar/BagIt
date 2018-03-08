
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Add New Category</title>
    <link href="<c:url value='/css1/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/css1/custom.css' />" rel="stylesheet"></link>
</head>
<body>


 <div class="form-container">
     
    <h1 align="center">Add Category</h1>
     
    <form:form method="POST" modelAttribute="category" class="form-horizontal">

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="title">Category Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="title" id="title" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="title" class="help-inline"/>
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
 
        
    </form:form>
    </div>
















<h3><a  href="homepage">homepage</a></h3>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

</body>
</html>