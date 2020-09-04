<%-- 
    Document   : listReader
    Created on : Jan 14, 2020, 11:21:10 AM
    Author     : pupil
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Our readers:</h1>
        <c:forEach var="reader" items="${listReaders}">
            <p>${reader}</p>
        </c:forEach>
    </body>
</html>
