
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Form</title>
    <link href="<c:url value='/css1/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/css1/custom.css' />" rel="stylesheet"></link>
</head>
 
<body>
 
    <div class="form-container">
     
    <h1 align="center">Registration</h1>
     
    <form:form method="POST" modelAttribute="customersDetails" class="form-horizontal">
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="firstName">First Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="firstName" id="firstName" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="firstName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Last Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="lastName" id="lastName" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="lastName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
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
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="emailId"> EmailId</label>
                <div class="col-md-7">
                    <form:input type="text" path="emailId" id=" emailId" class="form-control input-sm"/>
                    <div class="has-error">
                       <%--  <form:errors path=" emailId" class="help-inline"/> --%>
                    </div>
                </div>
            </div>
        </div> 
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="mobileNo">MobileNo</label>
                <div class="col-md-7">
                    <form:input type="text" path="mobileNo" id="mobileNo" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="mobileNo" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="registrationDate">registrationDate(dd/MM/yyyy)</label>
                <div class="col-md-7">
                    <form:input type="text" path="registrationDate" id="registrationDate" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="registrationDate" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
      
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="birth_Date">Password</label>
                <div class="col-md-7">
                    <form:input type="text" path="password" id="password" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="password" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
          
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="role">Role</label>
                <div class="col-md-7">
                    <form:input type="text" path="role" id="role" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="role" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
 
        
         
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="Register" class="btn btn-primary btn-sm">
            </div>
        </div>
        
        <h3><a  href="login">already have account!!!!</a></h3>
        		<h3><a  href="homepage">homepage</a></h3>
        
    </form:form>
    </div>
</body>
</html>

	