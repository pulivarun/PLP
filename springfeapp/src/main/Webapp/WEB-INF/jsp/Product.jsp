<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<jsp:include page="Header.jsp" />
<div>
<h2>Product Dispatch Report</h2>
<input type=text name="Product_id" id="Product_id" placeholder="Product_id">
<input type="button" value="Show Products" onclick="location.href='/ShowDispatch/'+document.getElementById('Product_id').value">
</div>
</body>
</html>