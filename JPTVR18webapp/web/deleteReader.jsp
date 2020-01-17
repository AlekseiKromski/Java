<%-- 
    Document   : deleteReader
    Created on : Jan 17, 2020, 8:51:30 AM
    Author     : pupil
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Delete reader</h1>
        <form action="deleteReaderAction" method="post">
            <select name="readerId">
                <c:forEach var="reader" items="${listReader}">
                    <option value="${reader.id}">${reader}</option>
                </c:forEach>
            </select>
            <input type="submit" name="submit">
        </form>
    </body>
</html>
