<%-- 
    Document   : deleteBook
    Created on : Jan 14, 2020, 10:25:36 AM
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
        <form method="post" action="deleteBookAction">
            <select name="bookId">
            <c:forEach var="book" items="${listBooks}">
                <option value="${book.id}">${book.id} = ${book.name}</option>
            </c:forEach>
            </select>
            <input type="submit" name="submit">
        </form>
    </body>
</html>
