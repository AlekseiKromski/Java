<%-- 
    Document   : browse menu
    Created on : Sep 24, 2020, 12:36:23 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:if test = "${loginOn == true}">
    <ul>
        <li><a href="<c:url value='/showFormAddResource'/>">Добавить новый ресурс</a></li>
        <li><a href="<c:url value='/listResource'/>">Список ресурсов</a></li>
        <li><a href="<c:url value='/listUser'/>">Список пользователей</a></li>        
        <li><a href="<c:url value='/showL'/>">Список пользователей</a></li>

    </ul>
</c:if>
