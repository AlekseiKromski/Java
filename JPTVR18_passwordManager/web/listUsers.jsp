<%-- 
    Document   : listUsers
    Created on : Sep 14, 2020, 10:02:23 PM
    Author     : yanikarp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>List of users</h1>
        <ul>
            <c:forEach var="user" items="${users}">
                <li>
                    <c:out value="${user}"/>
                </li>
            </c:forEach>

        </ul>