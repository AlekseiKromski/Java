<%-- 
    Document   : listResource
    Created on : Sep 10, 2020, 2:51:35 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>List of resource</h1>
        
        <ul>
            <c:forEach var="resource" items="${listResources}">
                <li><c:out value="${resource}" /> <a class="btn btn-danger" href="deleteResource?id=${resource.id}">Удалить</a></li>
            </c:forEach>
        </ul>