<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Log In Form</title>
    <link href="<c:url value='/css1/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/css1/custom.css' />" rel="stylesheet"></link>
</head>
 
<body>
 
    <div class="form-container">
    <h3 align="center" style="color: red;">${requestScope.invalidLoginMessage}</h3>
     
    <h1 align="center">Log In</h1>
     
    <form:form method="POST" modelAttribute="customersDetails" class="form-horizontal">
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="emailId">EmailId</label>
                <div class="col-md-7">
                    <form:input type="text" path="emailId" id="emailId" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="emailId" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="password">Password</label>
                <div class="col-md-7">
                    <form:input type="password" path="password" id="password" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="password" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        
         
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="Log In" class="btn btn-primary btn-sm">
            </div>
        </div>
        <h3><a  href="registration">New here?? Registrater</a></h3>
		<h3><a  href="homepage">Homepage</a></h3>
    </form:form>
    </div>
    
    
    
    
    
    
    
     <script>
function validLogin(){
if (document.form.userName.value == ""){
alert ( "Please enter Login Name." );
document.loginform.userName.focus();
return false;
}
if (document.form.password.value == ""){
alert ( "Please enter password." );
document.userform.password.focus();
return false;
}
alert ( "Welcome User" );
return true;
}
</script>
    
    
    
    
    
    
    
    
    
    
</body>
</html>