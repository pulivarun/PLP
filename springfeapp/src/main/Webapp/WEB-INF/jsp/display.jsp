<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css"/>
</head>
<body background="../images/c.png">
<jsp:include page="Header.jsp" />
<div>
<center>
	<table cellspacing="10" cellpadding="5" border="1" align="center">
	<br>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Description</th>
			
		</tr>
		<c:forEach items="${cust}" var="customer">
			<tr>
				<td>${customer. product_Id}</td>
				<td>${customer. product_Name}</td>
				<td>${customer. product_Price}</td>
				<td>${customer. product_Description}</td>
				
			</tr>
		</c:forEach>

	</table>
	</center>
	</div>
  <jsp:include page="Footer.jsp" />
</body>
</html>