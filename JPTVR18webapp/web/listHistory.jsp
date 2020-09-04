<%-- 
    Document   : listHistory3
    Created on : Jan 17, 2020, 10:37:19 AM
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
        <h1>Our historys:</h1>
        <c:forEach var="history" items="${listHistory}">
            <p>${history}</p>
        </c:forEach>
    </body>
</html>
