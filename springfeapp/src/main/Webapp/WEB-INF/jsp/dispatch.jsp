<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<jsp:include page="Header.jsp" />
<br>
<div>
<table cellspacing="10" cellpadding="5" border="1">
		<tr>
			<th>Dispatch_Id</th>
			<th>Dispatch_Time</th>
			<th>Merchant_Id</th>
			<th>Product_Id</th>
			<th>Product_Name</th>
			<th>Product_Location</th>
			
		</tr>
		<c:forEach items="${cust}" var="dispatch">
			<tr>
				<td>${dispatch. dispatch_id}</td>
				<td>${dispatch. dispatch_time}</td>
				<td>${dispatch. merchant_id}</td>
				<td>${dispatch. product_id}</td>
				<td>${dispatch. product_name}</td>
				<td>${dispatch. location}</td>
				
				
			</tr>
		</c:forEach>

	</table>
	</div>
</body>
</html>