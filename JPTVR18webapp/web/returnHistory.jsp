<%-- 
    Document   : returnHistory
    Created on : Jan 17, 2020, 10:11:53 AM
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
        <h1>Return book:</h1>
        <form action="returnHistoryAction" method="post">
            <select name="historyId">
                <c:forEach var="history" items="${listHistory}">
                    <option value="${history.id}">${history}</option>
                </c:forEach>
            </select>
            <input type="submit" name="submit">
        </form>
    </body>
</html>
