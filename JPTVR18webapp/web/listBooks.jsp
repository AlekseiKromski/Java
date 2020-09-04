<%-- 
    Document   : listBooks
    Created on : Jan 7, 2020, 10:47:50 AM
    Author     : pupil
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>list books</title>
    </head>
    <body>
        <h1>Our books:</h1>
        <c:forEach var="book" items="${listBooks}">
            <p>${book}</p>
        </c:forEach>
    </body>
</html>
