<%-- 
    Document   : listReader
    Created on : Jan 14, 2020, 11:21:10 AM
    Author     : pupil
--%>

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
        </c:foreach>
    </body>
</html>
