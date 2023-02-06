<%@page import="java.util.List"%>
<%@page import="Linkcode.shop.admin.model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!List<Product> lst = null;
	Product prod = null;%>

	<%
	lst =(List<Product>)  session.getAttribute("prodlst");
		session.invalidate();
%>
<table border="3px" background="gray" style="margin: 10%">
        <tr>
        <th>Product Id</th><th>Product Name</th><th>Product Price</th><th>Product Quantity</th><th>Add to cart</th>
        <%		
		for(Product prod:lst){%>
	
	
		<tr>
			<td><%=prod.getProdId()%></td>
			<td><%=prod.getProdName()%></td>
			<td><%=prod.getProdPrice()%></td>
			<td><%=prod.getProdQty()%></td>
			<td><button type="submit">add to cart</button></td>
		</tr>
		
           <%} %>
</body>
</html>