<%-- 
    Document   : index
    Created on : Sep 10, 2020, 2:01:18 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
                <li><a href="showFormLogin">Войти в систему</a></li>
                <li><a href="logout">Выйти из системы</a></li>
                <li><a href="showFormCreateUser">Добавить пользователя</a></li>
            </ul>
            <hr>
            <ul>
                <li><a href="showFormAddResource">Добавить новый ресурс</a></li>
                <li><a href="listResource">Список ресурсов</a></li>
                <li><a href="listUser">Список пользователей</a></li>
            </ul>
        </div>
    </div>
</div>