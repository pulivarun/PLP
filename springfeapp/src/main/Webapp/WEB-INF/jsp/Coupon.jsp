<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coupon</title>
<link rel="stylesheet" href="../css/style.css"/>
</head>
<body background="../images/c.png">
<jsp:include page="Header.jsp" />

<center>
<h2>Coupon</h2>
Enter Coupon Code<input type="email" id="code" name="code" placeholder="Enter code"/>
<input type=button value=submit onclick="location.href='/coupon/'+document.getElementById('code').value"/>
</center>
 <jsp:include page="Footer.jsp" />
</body>
</html>