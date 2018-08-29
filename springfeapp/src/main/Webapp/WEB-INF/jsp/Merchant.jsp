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
<h2>Merchant Products</h2>
<input type=text name="Merchand_id" id="Merchand_id" placeholder="Merchand_id">  
<input type="button" value="Show Products" onclick="location.href='/ShowProducts/'+document.getElementById('Merchand_id').value">
<!-- <a href="/ShowProducts">show Products</</a> -->
</div>
</body>
</html>