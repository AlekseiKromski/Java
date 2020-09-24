<%-- 
    Document   : index
    Created on : Sep 10, 2020, 2:01:18 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container-fluid">
    <div class="row justify-content-center">
        <div class="col-8">
            <c:if test="${not empty logout}">
                <div class="alert alert-success" role="alert">
                    ${logout}
                </div>
            </c:if>
            <p>
                ${info}
            </p>
            <h1>Hello to password manager</h1>
            <ul>
                <li><a href="<c:url value='/showFormLogin'/>">Войти в систему</a></li>
                <li><a href="<c:url value='/logout'/>">Выйти из системы</a></li>
                <li><a href="<c:url value='/showFormCreateUser'/>">Добавить пользователя</a></li>
            </ul>
                <%@include file="menu/browse_menu.jsp" %>
        </div>
    </div>
</div>