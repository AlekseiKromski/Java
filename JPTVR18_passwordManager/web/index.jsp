<%-- 
    Document   : index
    Created on : Sep 10, 2020, 2:01:18 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Hello to password manager</h1>
        <p>
            ${info}
        </p>
        <p>Links:</p>
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
        
    </body>
</html>
