<%-- 
    Document   : addHistory
    Created on : Jan 17, 2020, 9:17:36 AM
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
        <h1>Create history</h1>
        <form action="addHistoryAction" method="post">
            <select name="bookId">
                <c:forEach var="book" items="${listBook}">
                    <option value="${book.id}">${book}</option>
                </c:forEach>
            </select>
            <br>
            <select name="readerId">
                <c:forEach var="reader" items="${listReader}">
                    <option value="${reader.id}">${reader}</option>
                </c:forEach>
            </select>
            <br>
            <input type="submit" name="submit">
        </form>
    </body>
</html>
