<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PRODUCT CATEGORIES</title>
<link href="<c:url value='/css/main.css'/>" type="text/css"
	rel="stylesheet" />
</head>
<body>
	<form:form modelAttribute="book" method="post">
		<table>

			<tr>
				<td>Select Products Category</td>
				<td><form:select path="category">
						<form:option value="" label="Select Category" />
						<form:options items="${requestScope.category_list}" />
					</form:select></td>
					<td><form:errors path="category"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Choose" /></td>
				<c:url var="url" value="view"/>
				<td><input type="submit" value="View Cart" formaction="${url}" /></td>
			</tr>

		</table>
	</form:form>
	<h3 align="center">
		<a href="<c:url value='check_out'/>">Check Out</a>
	</h3>

</body>