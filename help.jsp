<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>

   <%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!--  First method to -->





<!--  second method -->

<h1> name is ---${name}</h1>
<h1>Time And Date ${time}</h1>

<hr>
<c:forEach var="item" items="${marks }">
<h1>${item}</h1>

</c:forEach>



</body>
</html>