<%-- 
    Document   : showFormAddResource
    Created on : Sep 10, 2020, 2:50:54 PM
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
        <h1>Создание нового ресурса</h1>
        <form method="post" action="createUser">
            <p>
                Login of user 
                <input type="text" name="login">
            </p>
            <p>
                Password of resource: 
                <input type="password" name="password">
            </p>
            <input type="submit" name="submit" value="create user">

        </form>
    </body>
</html>
