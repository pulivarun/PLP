<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css"/>
</head>
<body background="../images/c.png">
<jsp:include page="Header.jsp" />
<div>
<center>
<h2>Product Dispatch Report</h2>
<input type=text name="Merchand_id" id="Product_id" placeholder="Product_id">  
<input type="button" value="Show Products" onclick="location.href='/ShowDispatch/'+document.getElementById('Product_id').value">
<!-- <a href="/ShowProducts">show Products</</a> -->
</center>
</div>
 <jsp:include page="Footer.jsp" />
</body>
</html>