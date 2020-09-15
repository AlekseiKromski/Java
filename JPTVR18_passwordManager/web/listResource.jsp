<%-- 
    Document   : listResource
    Created on : Sep 10, 2020, 2:51:35 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of resource</h1>
        
        <ul>
            <c:forEach var="resource" items="${resources}">
                <li><c:out value="${resource}" /></li>
            </c:forEach>
        </ul>

    </body>
</html>